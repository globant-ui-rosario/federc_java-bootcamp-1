package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private User user;
	private List<Item> itemsCollection = new ArrayList<Item>();
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
