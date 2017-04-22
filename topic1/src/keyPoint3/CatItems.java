package keyPoint3;

import java.util.ArrayList;

public class CatItems { // It's a Singleton Class
	
	private static CatItems catItems = null;
	private Item itemSearched;
	private ArrayList<Item> items = new ArrayList<Item>();

	private CatItems() {
	}

	public static CatItems getInstance() {  // I make sure that this class will have only one instance
		if (catItems == null) {
			catItems = new CatItems();
		}
		return catItems;
	}

		public Item serchItem (String name){
			for (Item i: items){
				if(i.getName().equalsIgnoreCase(name)){
					itemSearched=i;
				}
			}
			
			return itemSearched;
		}
	

}
