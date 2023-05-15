
public class Account {

	private Integer number;
	private String holder;
	private Double balance = 0.0;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Integer number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}

	@Override
	public String toString() {
		return "Account: " + number + ", Holder: " + holder + ", Balance: $" + balance;
	}
	
}
