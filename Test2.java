
public class Test2 {

	public static void main(String[] args) {
		byte a=10, b=20;
		System.out.println("a+b = " + (a+b)); //연산자 우선순위에 의해 괄호를 사용해야함;
		
		System.out.println(++a); //전위연산자;
		System.out.println(a++); //후위연산자;
	}

}
