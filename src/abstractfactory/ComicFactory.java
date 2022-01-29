package abstractfactory;

public interface ComicFactory {
	public Ballons createBallons();
	public Caption createCaptions();
	public Panel createPanels();
	public Text createText();
	
	}
