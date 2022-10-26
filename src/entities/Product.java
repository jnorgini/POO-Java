package entities;

public class Product {
	
	public String name;
	public Double price;
	public Integer quantity;
	
	public Product() {
	}

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public Double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(Integer quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Updated data: "
				+ name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

}
