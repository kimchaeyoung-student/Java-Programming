import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		int grade;
		char s1, s2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		grade = scanner.nextInt();
		
		if(grade==100)
			System.out.println("A+");
		else if(grade>=90) {
			s1 = 'A'; //System.out.println("A");
			if((grade%10) >= 5) {
				s2='+';
			}
			else {
				s2='0';
			}
			System.out.println("등급 : " + s1 + s2);
		}
		else if(grade>=80) {
			s1 = 'B'; //System.out.println("B");
			if((grade%10) >= 5) {
				s2='+';
			}
			else {
				s2='0';
			}
			System.out.println("등급 : " + s1 + s2);
		}
		else if(grade>=70) {
			s1 = 'c'; //System.out.println("C");
			if((grade%10) >= 5) {
				s2='+';
			}
			else {
				s2='0';
			}
			System.out.println("등급 : " + s1 + s2);
		}	
		else if(grade>=60) {
			s1 = 'D'; //System.out.println("D");
			if((grade%10) >= 5) {
				s2='+';
			}
			else {
				s2='0';
			}
			System.out.println("등급 : " + s1 + s2);
		}
		else if(grade<60) {
			s1 = 'F'; //System.out.println("F");
			s2 = ' ';
			System.out.println("등급 : " + s1 + s2);
		}
		
		scanner.close();
	}
}