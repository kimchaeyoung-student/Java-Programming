//call by value
import java.util.Scanner;
public class BankAccount {

	public static void main(String[] args) {
		int input;
		long balance;
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		
		while(true) {
			System.out.println("원하는 거래 선택");
			System.out.println("[1]입금(DEPOSIT)");
			System.out.println("[2]출금(WITHDRAW)");
		
			input = sc.nextInt();
			System.out.print("금액 입력 : ");
			balance = sc.nextLong();
		
			if(input==1) {
				a.deposit(balance);
			}
			else if(input==2) {
				a.withdraw(balance);
			}
			else {
				System.out.println("잘못 선택하셨습니다.");
			}
//			sc.close(); 닫는 시점 오류,, 가비지 컬렉션에 의해 자바가 닫아주는 역할을 함;
		}
	}
}

class Account{
	private long balance = 0L;
	
	public void deposit(long mo) {
		balance += mo;
		System.out.println("잔액 : " + balance);
	}
	public void withdraw(long mo) {
		balance -= mo;
		System.out.println("잔액 : " + balance);
	}
}