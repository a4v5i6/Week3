package abstractfactory;

public class BritishComicBook extends CommicBook{
	
	ComicFactory comicFactory;
	
	public BritishComicBook(ComicFactory comicFactory) {
		this.comicFactory = comicFactory;
	}
	@Override
	void build() {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + name);
		ballons = comicFactory.createBallons();
		caption = comicFactory.createCaptions();
		panel = comicFactory.createPanels();
		text = comicFactory.createText();
		
	}

}
