package keyPoint4;

public class Item {
	
	private String name;
	private float price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Item(){
		
	}

	
	public String toString() {
		return name + ": ----- $" + price;
	}	
	

}
