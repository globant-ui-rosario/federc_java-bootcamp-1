package keyPoint7;

import java.util.ArrayList;
import java.util.Iterator;

public class CatItems { // It's a Singleton Class
	
	private static CatItems catItems = null;
	private Item itemSearched;
	private ArrayList<Item> items = new ArrayList<Item>();

	public CatItems() {
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
		
		public void addItem(Item item) {
			items.add(item);
		}
		
		public Iterator<Item> iterator() {  // Iterator Design Pattern used
			return new CatItemsIterator();
		}

		class CatItemsIterator implements Iterator<Item> {
			int currentIndex = 0;

			@Override
			public boolean hasNext() {
				if (currentIndex >= items.size()) {
					return false;
				} else {
					return true;
				}
			}

			@Override
			public Item next() {
				return items.get(currentIndex++);
			}

			@Override
			public void remove() {
				items.remove(--currentIndex);
			}

		}
	

}
