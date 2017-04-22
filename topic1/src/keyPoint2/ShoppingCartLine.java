package keyPoint2;

public class ShoppingCartLine {
	
	private Item item;
	private int quant;
	
	public ShoppingCartLine(Item it, int q){
		this.setItem(it);
		this.setQuant(q);
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	

}
