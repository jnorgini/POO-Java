package entities;

public class CurrencyConverter {
	
	private Double dollar;
	private Double amount;
	
	public CurrencyConverter() {
	}

	public CurrencyConverter(Double dollar, Double amount) {
		this.dollar = dollar;
		this.amount = amount;
	}

	public Double getDollar() {
		return dollar;
	}

	public Double getAmount() {
		return amount;
	}
	
	public Double price() {
		return dollar * amount;
	}
	
	public Double finalPrice() {
		return price() * 6 / 100 + price();
	}
	
	public String toString() {
		return "Amount to be paid in reais = "
				+ String.format("%.2f", finalPrice());
	}
	
}
