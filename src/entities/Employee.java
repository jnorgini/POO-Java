package entities;

public class Employee {
	
	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Employee() {
	}

	public Employee(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public Double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString() {
		return "Employee: "
				+ name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}
}
