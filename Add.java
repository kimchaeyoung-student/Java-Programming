import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 5;
		int y = 0;
		int sum;
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ� : ");
		x = input.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ� : ");
		y = input.nextInt();
		
		sum = x/y;
		
		//System.out.println(sum);
		System.out.println("������ = " + sum);
		
		input.close();
	}

}