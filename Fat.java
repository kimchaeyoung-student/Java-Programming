//if ��ø
import java.util.Scanner;
public class Fat {

	public static void main(String[] args) {
		int fat;
		Scanner sc = new Scanner(System.in);
		System.out.print("���淮�� �Է��ϼ��� : ");
		fat = sc.nextInt();
		
		if(fat>=40) {
			if(fat>=50)
				System.out.println("A���");
			else
				System.out.println("B���");
		}
		else {
			if(fat>=30)
				System.out.println("C���");
			else
				System.out.println("D���");
		}
		
		sc.close();
	}
}