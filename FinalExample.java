import java.util.Scanner;

public class FinalExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.14;
		double radius;
		
		System.out.print("������ �Է� : ");
		radius = scanner.nextDouble();
		
		double circum = 2 * PI * radius;
		//PI = 3.14159; PI�� �������̱� ������ ������ �� ����;
		double area = PI * radius * radius;
		
		System.out.println("���� ���̴� " + area);
		System.out.println("���� �ѷ��� " + circum);
		
		scanner.close();

	}

}