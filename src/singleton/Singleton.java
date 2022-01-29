package singleton;
import java.util.*;
import abstractfactory.*;
public class Singleton {
	private static Singleton instance;
	private List<CommicBook> inventory;
	private Singleton() {}
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public String getDescription() {
		return "Thread safe Singleton";
	}
	public void setInventory(List<CommicBook> commicBooks) {
		inventory = commicBooks;
	}
	public void addInventory(CommicBook commicBook) {
		inventory.add(commicBook);
	}
	public void removeInventory(CommicBook commicBook) {
		inventory.remove(commicBook);
	}
	public int getSize() {
		return inventory.size();
	}
	public void display() {
		for (CommicBook cob : inventory)
			System.out.println(cob);
			
	}
}
