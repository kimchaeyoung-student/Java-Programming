import java.util.Scanner;
class Circle{
	double radius;
	public double getArea(int radius) {
		return 3.14 * radius * radius;
	}
}
public class CircleTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle circle = new Circle();
//		circle.radius = sc.nextInt();
//		circle.radius = 10;
		System.out.print("반지름을 입력해주세요 : ");
		System.out.println(circle.getArea(sc.nextInt()));
		
		sc.close();
	}
}