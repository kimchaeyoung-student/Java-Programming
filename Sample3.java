import java.util.Scanner;



public class Sample3 {

	public static int plus(int a, int b) {
		return a+b; // �޼ҵ� 
		
	}
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	int a;
	int b;
//	int sum;
	System.out.println("���ڸ� �Է��Ͻÿ�");
	
	a=sc.nextInt();
	
	System.out.println("���ڸ� �Է��Ͻÿ�");
	b=sc.nextInt();
	
	//sum=a+b;
	
	System.out.println("�� ���� ����:" + plus(a,b));
	
	sc.close();
	}

}