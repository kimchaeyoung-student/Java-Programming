import java.util.Scanner;
import static java.lang.System.out;
public class Pay {

	public static void main(String[] args) {
		int pay, hours;
		Scanner scanner = new Scanner(System.in);
		
			out.print("�ð��� �Է��ϼ��� : ");
		hours = scanner.nextInt();
		
		if(hours>0) {
		pay = hours * 8600;
			out.println("�ӱ��� " + pay + "�� �Դϴ�.");
		}
		else {
			out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
	scanner.close();
	}
}
