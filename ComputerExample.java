import java.util.Scanner;

class Calculator3 {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의  areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
class Computer extends Calculator3{
//	@override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
public class ComputerExample {

	public static void main(String[] args) {
		int r = 10, i;

		Computer com = new Computer();
		Calculator3 cal = new Calculator3();
		
		while(true) {
		System.out.print("계산할 객체를 선택하세요 (1:Calculator/2:Computer) : ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
		if(i==1) {
			System.out.println("원 면적 : " + cal.areaCircle(r));
			System.out.println();
		}
		else if(i==2) {
			System.out.println("원 면적 : " + com.areaCircle(r));
			System.out.println();
		}
		else {
			System.out.println("잘못입력");
			System.out.println();
		}
//		sc.close();
		}
	}
}