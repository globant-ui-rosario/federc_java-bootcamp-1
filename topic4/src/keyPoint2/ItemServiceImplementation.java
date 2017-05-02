package keyPoint2;

import java.util.List;

public class ItemServiceImplementation implements ItemService {
	
	DataItem dataItem;
	
	public ItemServiceImplementation(DataItem dataItem){
		this.setDataItem(dataItem);
	}

	public void setDataItem(DataItem dataItem) {
		this.dataItem = dataItem;
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
