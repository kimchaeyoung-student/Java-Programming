import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 5;
		int y = 0;
		int sum;
		
		System.out.print("첫 번째 숫자를 입력하시오 : ");
		x = input.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오 : ");
		y = input.nextInt();
		
		sum = x/y;
		
		//System.out.println(sum);
		System.out.println("나눈값 = " + sum);
		
		input.close();
	}

}