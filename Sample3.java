import java.util.Scanner;



public class Sample3 {

	public static int plus(int a, int b) {
		return a+b; // 메소드 
		
	}
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	int a;
	int b;
//	int sum;
	System.out.println("숫자를 입력하시오");
	
	a=sc.nextInt();
	
	System.out.println("숫자를 입력하시오");
	b=sc.nextInt();
	
	//sum=a+b;
	
	System.out.println("두 수의 합은:" + plus(a,b));
	
	sc.close();
	}

}