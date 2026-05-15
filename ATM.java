class ATMTransaction {
	private double balance;
	public ATMTransaction(double balance) {
		this.balance=balance;
	}
	public void deposit(double amount) {
		try {
			System.out.println("Deposting:$"+amount);
			double check=100/(int)amount;
			balance+=amount;
			System.out.println("Deposite successful!");
			System.out.println("Balnce:$"+balance);
		}catch(ArithmeticException e) {
			System.out.println("Deposite error occurred");
		}finally {
			System.out.println("Deposite process completed.");
			System.out.println("------------------------");
		}
	}
public void withdraw(double amount) {
	try {
		System.out.println("Withdrawing:$"+amount);
		double fee =amount * 0.02;
		double total=amount+fee;
		int check=(int)(balance/(balance-total));
		balance-=total;
		System.out.println("withdrawal successful!");
		System.out.println("Fee:$"+fee);
		System.out.println("Remaining Balance :$"+balance);
	}catch(ArithmeticException e) {
		System.out.println("Withdrawal failed:Insufficient balance");
	}catch(Exception e) {
		System.out.println("Withdrawal error occurred");
	}finally {
		System.out.println("Withdrawal process completed. ");
		System.out.println("------------------------");
	}
}
}
public class ATM{

	public static void main(String[] args) {
		ATMTransaction atm=new ATMTransaction(1000);
		atm.deposit(500);
		atm.deposit(0);
		atm.withdraw(300);
	}
}