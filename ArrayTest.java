import java.util.Scanner;
public class ArrayTest {
	final static int STUDENT = 5;

	public static void main(String[] args) {
		int[] scores = new int[STUDENT];
		getValue(scores);	//메소드 선언;
		getAverage(scores);	//메소드 선언;
	}
	
	//입력받기;
	private static void getValue(int[] array) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.print(i + "번째 성적을 입력하세요 : ");
			array[i] = sc.nextInt();
		}
		sc.close();
	}
	
	//출력하기;
	private static void getAverage(int[] array) {
		int total = 0;
		for(int i=0;i<array.length;i++) {
			total = total + array[i];
		}
		System.out.println("평균 : " + total/array.length);
	}
}
