package book_shop.dto;

import book_shop.entity.Product;

public class CartDTO {
	private int quantity;
	private double totalSum;
	private Product product;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public CartDTO(int quantity, double totalSum, Product product) {
		super();
		this.quantity = quantity;
		this.totalSum = totalSum;
		this.product = product;
	}
	
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
