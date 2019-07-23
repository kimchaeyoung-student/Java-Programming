class OverloadingTest{
	void test() {
		System.out.println(	"매개 변수 없는 메소드");
	}
	void test(int a, int b) {
		int sum=a+b;
		System.out.println("int형 a+b : "+sum);
	}
	void test(double a, double b) {
		double sum=a+b;
		System.out.println("double형 a+b : "+sum);
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
