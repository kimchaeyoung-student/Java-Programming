//���ǿ����� ���;
//import java.math.*;
import java.util.Scanner;
public class Max2 {

	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ���� �Է����ּ��� : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println(x>y ? x + "�� ũ��." : y + "�� ũ��.");
		
		scanner.close();
	}

}
