package entities;

import java.util.Objects;

public class Product {
	
	private String description;
	private double price;

	public Product() {
	}

	public Product(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * Predicado por referência stática
	 */
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}
	
	/*
	 * Método estático para ser utilizado como consumer
	 */
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	/*
	 * Predicado por referência NÃO stática
	 */
	public boolean nonStaticProductPredicate() {
		return price >= 100.00;
	}
	
	/*
	 * Método não estático para ser utilizado como consumer
	 */
	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}
	
	/*
	 * Predicado por referência stática
	 */
	public static String staticUpperCaseDescription(Product p) {
		return p.getDescription().toUpperCase();
	}
	
	/*
	 * Predicado por referência NÃO stática
	 */
	public String nonStaticUpperCaseDescription() {
		return description.toUpperCase();
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	
	
}
