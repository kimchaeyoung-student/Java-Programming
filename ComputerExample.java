import java.util.Scanner;

class Calculator3 {
	double areaCircle(double r) {
		System.out.println("Calculator ��ü��  areaCircle() ����");
		return 3.14159 * r * r;
	}
}
class Computer extends Calculator3{
//	@override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
public class ComputerExample {

	public static void main(String[] args) {
		int r = 10, i;

		Computer com = new Computer();
		Calculator3 cal = new Calculator3();
		
		while(true) {
		System.out.print("����� ��ü�� �����ϼ��� (1:Calculator/2:Computer) : ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
		if(i==1) {
			System.out.println("�� ���� : " + cal.areaCircle(r));
			System.out.println();
		}
		else if(i==2) {
			System.out.println("�� ���� : " + com.areaCircle(r));
			System.out.println();
		}
		else {
			System.out.println("�߸��Է�");
			System.out.println();
		}
//		sc.close();
		}
	}
}