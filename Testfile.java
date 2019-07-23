class returnvalue{
	public void value() {
	System.out.println("반환값 없음");
	
	}
	
	public int getSum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public String getPhone(String phone) {
		String str=phone;
		return str;
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnvalue rv=new returnvalue();
		
		rv.value();
		int a=10; int b=20;
		int value1=rv.getSum(a, b);
		String value2=rv.getPhone("010-1111-2222");
		
		System.out.println("a+b="+value1);
		System.out.println("현재 폰의 번호는 : " + value2);
	}

}
