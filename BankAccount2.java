//call by value
import java.util.Scanner;
public class BankAccount {

	public static void main(String[] args) {
		int input;
		long balance;
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		
		while(true) {
			System.out.println("���ϴ� �ŷ� ����");
			System.out.println("[1]�Ա�(DEPOSIT)");
			System.out.println("[2]���(WITHDRAW)");
		
			input = sc.nextInt();
			System.out.print("�ݾ� �Է� : ");
			balance = sc.nextLong();
		
			if(input==1) {
				a.deposit(balance);
			}
			else if(input==2) {
				a.withdraw(balance);
			}
			else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
			}
//			sc.close(); �ݴ� ���� ����,, ������ �÷��ǿ� ���� �ڹٰ� �ݾ��ִ� ������ ��;
		}
	}
}

class Account{
	private long balance = 0L;
	
	public void deposit(long mo) {
		balance += mo;
		System.out.println("�ܾ� : " + balance);
	}
	public void withdraw(long mo) {
		balance -= mo;
		System.out.println("�ܾ� : " + balance);
	}
}