import java.util.Scanner;

abstract class Test10{
abstract int add(int a, int b); 
}

public class Sample4 extends Test10 {
public  int add(int a, int b) {
	return a+b; // 메소드 
}

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	Sample4 s= new Sample4();
	int a;
	int b;
//	int sum;
	System.out.println("숫자를 입력하시오");
	
	a=sc.nextInt();
	
	System.out.println("숫자를 입력하시오");
	b=sc.nextInt();
	
//	sum=a+b;
	
	System.out.println("두 수의 합은:" + s.add(a,b));

	sc.close();
	}
}