package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class DataItem {
	
	List<Item> itemCollection = new ArrayList<Item>();

	public List<Item> getAllItems() {
		return itemCollection;
	}

	public Item getItemByName(String name) {
		Item item = null;
		for(Item i : itemCollection){
			if(i.getName().equalsIgnoreCase(name)){
				item=i;
			}
		}
		return item;
	}

}
