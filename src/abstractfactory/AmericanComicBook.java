package abstractfactory;

public class AmericanComicBook extends CommicBook{
	
	ComicFactory comicFactory;
	
	public AmericanComicBook(ComicFactory comicFactory) {
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
