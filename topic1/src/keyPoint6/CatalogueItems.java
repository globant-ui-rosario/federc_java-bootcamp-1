package keyPoint6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogueItems { // It's a Singleton Class
	
	private static CatalogueItems catalogueItems = null;
	
	private List<Item> items = new ArrayList<Item>();

	public CatalogueItems() {
	}
		

	public static CatalogueItems getInstance() {  // I make sure that this class will have only one instance
		if (catalogueItems == null) {
			catalogueItems = new CatalogueItems();
		}
		return catalogueItems;
	}

		public Item searchItem (String name){
			Item itemSearched = new Item();
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

		public void changePrice(double p, Item i) {
			i.setPrice(p);
			
		}


}
