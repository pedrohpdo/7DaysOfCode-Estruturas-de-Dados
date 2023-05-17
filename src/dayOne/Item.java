package dayOne;

public class Item {
	private Product product;
	private int quantity;
	
	public Item(String name, int quantity) {
		this.product = new Product(name);
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return String.format("Item: %s | %d unidades", getProduct().getName(), getQuantity());
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
}
