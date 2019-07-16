//조건연산자 사용;
//import java.math.*;
import java.util.Scanner;
public class Max2 {

	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 수를 입력해주세요 : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println(x>y ? x + "가 크다." : y + "가 크다.");
		
		scanner.close();
	}

}
