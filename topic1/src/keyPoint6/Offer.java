package keyPoint6;

import java.util.ArrayList;

public class Offer {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private float total;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public Offer(String nm, ArrayList<Item> itms){
		this.setName(nm);
		this.setItems(itms);
	}

	public float getTotal() {
		float tot=0;
		for(Item i: items){
			tot+=i.getPrice();
		}
		total=(float) (tot*0.9);  // here is the discount for this offer
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "name: "+name+ " ----- $" + total;
	}	

}
