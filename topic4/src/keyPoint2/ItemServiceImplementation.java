package keyPoint2;

import java.util.List;

public class ItemServiceImplementation implements ItemService {
	
	DataItem dataItem;
	
	public ItemServiceImplementation(){
		dataItem = new DataItem();
	}

	@Override
	public List<Item> getAllItems() {
		return dataItem.getAllItems();
	}

	@Override
	public Item getItemByName(String name) {
		return dataItem.getItemByName(name);
	}

}
