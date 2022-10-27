package entities;

public class Bank {
	
	private Integer account;
	private String holder;
	private Double deposit;
	
	public Bank() {
	}

	public Bank(Integer account, String holder, Double deposit) {
		this.account = account;
		this.holder = holder;
		this.deposit = deposit;
	}

	public Integer getAccount() {
		return account;
	}

	public String getHolder() {
		return holder;
	}


	public Double getDeposit() {
		return deposit;
	}
	
	public void depositValue(Double amount) {
		deposit += amount;
	}
	
	public void withdrawValue(Double amount) {
		deposit -= amount + 5;
	}
	
	public String toString() {
		return "Account "
				+ account
				+ ", Holder: "
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", deposit);
	}

}
