package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private static int id = 0;
	private User user;
	private List<Item> itemsCollection = new ArrayList<Item>();
	private Boolean paid = false;
	
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	public ShoppingCart(User user){
		this.setUser(user);
		id++;
	}
	public int getId() {
		return id;
	}	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Item> getItemsCollection() {
		return itemsCollection;
	}
	public void setItemsCollection(List<Item> itemsCollection) {
		this.itemsCollection = itemsCollection;
	}

}
