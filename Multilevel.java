class RBI {
	void interestRate() {
		System.out.println("Bank interest rate:3%");
	}
}
class Account extends RBI{
	@Override
	void interestRate() {
		System.out.println("Account interest rate:5%");
	}
}
class SavingsAccount extends Account{
	@Override
	void interestRate() {
		System.out.println("Savings Account interest rate:7%");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.interestRate();
	}
}
