package keyPoint1;

public class CatItems { // It's a Singleton Class
	
	private static CatItems catItems = null;
	private Item itemSearched;

	private CatItems() {
	}

	public static CatItems getInstance() {
		if (catItems == null) {
			catItems = new CatItems();
		}
		return catItems;
	}

		public Item serchItem (String name){  // modificar (collecion)
			Item it = new Item();
			if(it.getName().equalsIgnoreCase(name)){
				itemSearched=it;
			}
			return itemSearched;
			
		}
	

}
