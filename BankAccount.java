class Account{
	String accountNo;
	String onwerName;
	int balance,deposit,withdraw;
	
	void deposit(int amount) {
		balance = balance+amount;
	}
	int withdraw(int amount) {
		if(balance<amount)
			System.out.println("�ܾ��� �����մϴ�.");
		balance = balance - amount;
		return amount;
	}
}
public class BankAccount {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.accountNo = "3333-07-7011913";
		obj.onwerName = "��ä��";
		obj.balance = 10000;
		
		obj.deposit(50000);
		System.out.println("��  �� : " + obj.accountNo + "\n��  �� : " + obj.onwerName + "\n��  �� : " + obj.balance);
		
		obj.withdraw(20000);
		System.out.println("��  �� : " + obj.balance);
	}
}
