package abstractfactory;

public class AmericanPublisher extends Publisher{

	public CommicBook createComic(String name) {
		CommicBook commicBook = null;
		ComicFactory commicFactory = new AmericanComicFactory();
		
		commicBook = new AmericanComicBook(commicFactory);
		commicBook.setName(name);
		commicBook.build();
		return commicBook;
	}


}