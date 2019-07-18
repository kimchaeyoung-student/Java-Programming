class Account{
	String accountNo;
	String onwerName;
	int balance,deposit,withdraw;
	
	void deposit(int amount) {
		balance = balance+amount;
	}
	int withdraw(int amount) {
		if(balance<amount)
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
		balance = balance - amount;
		return amount;
	}
}
public class BankAccount {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.accountNo = "3333-07-7011913";
		obj.onwerName = "±èÃ¤¿µ";
		obj.balance = 10000;
		
		obj.deposit(50000);
		System.out.println("°è  ÁÂ : " + obj.accountNo + "\nÀÌ  ¸§ : " + obj.onwerName + "\nÀÜ  ¾× : " + obj.balance);
		
		obj.withdraw(20000);
		System.out.println("ÀÜ  ¾× : " + obj.balance);
	}
}
