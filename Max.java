//if-else�� ���;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ���� �Է����ּ��� : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x>y)
			System.out.println("�� ū���� " + x + "�Դϴ�.");
		else
			System.out.println("�� ū���� " + y + "�Դϴ�.");
		
		scanner.close();
	}

}
