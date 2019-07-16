
public class ifStmt {

	public static void main(String[] args) {
		f(30);
	}
	static void f(int i){
		if(i%2==0)
			System.out.println("짝수");
		if(i%3==0)
			System.out.println("3의 배수");
		if(i%5==0)
			System.out.println("5의 배수");
	}

}