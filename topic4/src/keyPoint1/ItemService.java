package keyPoint1;

import java.util.List;

public interface ItemService {
	
	public List<Item> getAllItems();
	public Item getItemByName(String name);

}