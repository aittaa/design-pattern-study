package iterator.MenuItemWithCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu implements Menu {
	ArrayList<MenuItem> menuItems;
  
	public DinerMenu() {
		menuItems = new ArrayList<MenuItem>();
 
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 3.05);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 3.89);
	}
  
	public void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}

	public Iterator<MenuItem>  createIterator() {
		return menuItems.iterator();
	}
 
	// other menu methods here
}
