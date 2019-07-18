class OOP{
	public void foo(int a) {
		System.out.println("숫자출력");
		System.out.println(a);
	}
	public void foo(String a) {
		System.out.println("문자출력");
		System.out.println(a);
	}
}
public class test2 {

	public static void main(String[] args) {
		OOP oop = new OOP();
		oop.foo(1);
		System.out.println();
		oop.foo("Hello");
	}
}
