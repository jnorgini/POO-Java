package entities;

public class Rectangle {
	
	private Double width;
	private Double height;
	
	public Rectangle() {
	}

	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public Double getHeight() {
		return height;
	}
	
	public Double area() {
		return width * height;
	}
	
	public Double perimeter() {
		return 2 * (width + height);
	}
	
	public Double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + (Math.pow(width, 2)));
	}

}
