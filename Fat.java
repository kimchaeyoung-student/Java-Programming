//if 중첩
import java.util.Scanner;
public class Fat {

	public static void main(String[] args) {
		int fat;
		Scanner sc = new Scanner(System.in);
		System.out.print("지방량을 입력하세요 : ");
		fat = sc.nextInt();
		
		if(fat>=40) {
			if(fat>=50)
				System.out.println("A등급");
			else
				System.out.println("B등급");
		}
		else {
			if(fat>=30)
				System.out.println("C등급");
			else
				System.out.println("D등급");
		}
		
		sc.close();
	}
}