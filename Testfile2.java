class OverloadingTest{
	void test() {
		System.out.println(	"�Ű� ���� ���� �޼ҵ�");
	}
	void test(int a, int b) {
		int sum=a+b;
		System.out.println("int�� a+b : "+sum);
	}
	void test(double a, double b) {
		double sum=a+b;
		System.out.println("double�� a+b : "+sum);
}

}

public class Test4 {

	public static void main(String[] args)throws Exception {
		OverloadingTest of = new OverloadingTest();
		of.test();
		of.test(3,15);
		of.test(4.0,5.0);

	}

}
