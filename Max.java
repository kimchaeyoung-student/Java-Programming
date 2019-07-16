//if-else문 사용;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 수를 입력해주세요 : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x>y)
			System.out.println("더 큰수는 " + x + "입니다.");
		else
			System.out.println("더 큰수는 " + y + "입니다.");
		
		scanner.close();
	}

}
