import java.util.Scanner;
import static java.lang.System.out;
public class Pay {

	public static void main(String[] args) {
		int pay, hours;
		Scanner scanner = new Scanner(System.in);
		
			out.print("시간을 입력하세요 : ");
		hours = scanner.nextInt();
		
		if(hours>0) {
		pay = hours * 8600;
			out.println("임금은 " + pay + "원 입니다.");
		}
		else {
			out.println("잘못입력하셨습니다.");
		}
		
	scanner.close();
	}
}
