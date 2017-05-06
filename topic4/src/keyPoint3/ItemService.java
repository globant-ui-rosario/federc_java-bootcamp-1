package keyPoint3;

import java.util.List;

import keyPoint2.Item;

public interface ItemService {

	/**
	 * This method it's called for retrieve all existing items
	 * 
	 * @author Aguirre Federico working on Java Bootcamp 2017
	 * @return an item collection
	 */
	public List<Item> getAllItems();

	/**
	 * This method receives an item name. Then, it searches and returns the
	 * specific item
	 * 
	 * @author Aguirre Federico working on Java Bootcamp 2017
	 * @param receives
	 *            an item name
	 * @return a specific item
	 */
	public Item getItemByName(String name);

}
