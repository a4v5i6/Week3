package abstractfactory;

public class BritishComicPublisher extends Publisher{

	public CommicBook createComic(String name) {

		CommicBook commicBook = null;
		ComicFactory commicFactory = new BritishComicFactory();
		
		commicBook = new BritishComicBook(commicFactory);
		commicBook.setName(name);
		commicBook.build();

		return commicBook;
	}


}
