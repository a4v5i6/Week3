package comicbooks;

import singleton.Singleton;
import abstractfactory.*;
import java.util.*;

public class SingletonTest {

	public static void main(String[] args) {
		List<CommicBook> inventory = new ArrayList<CommicBook>();
		
		
		Singleton singleton= Singleton.getInstance();
		System.out.println(singleton.getDescription());
		
		
		Publisher ukPublisher = new BritishComicPublisher();
		Publisher usaPublisher = new AmericanPublisher();
		
		
		inventory.add(ukPublisher.createComic("Adventure"));
		inventory.add(ukPublisher.createComic("Beano"));
		inventory.add(usaPublisher.createComic("AstroCity"));
		inventory.add(usaPublisher.createComic("Big Bang"));
		CommicBook backup = usaPublisher.createComic("Air Boy");
		
		
		
		singleton.setInventory(inventory);
		
		singleton.addInventory(backup);
		
		System.out.println("Length " + singleton.getSize());
		
		singleton.display();
		
		singleton.removeInventory(backup);
		
		
		System.out.println("Length " + singleton.getSize());
		
	}

}
