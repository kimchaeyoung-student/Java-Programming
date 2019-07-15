import java.util.Scanner;

public class FinalExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.14;
		double radius;
		
		System.out.print("반지름 입력 : ");
		radius = scanner.nextDouble();
		
		double circum = 2 * PI * radius;
		//PI = 3.14159; PI는 고정값이기 때문에 변경할 수 없다;
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이는 " + area);
		System.out.println("원의 둘레는 " + circum);
		
		scanner.close();

	}

}