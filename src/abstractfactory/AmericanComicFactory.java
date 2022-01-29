package abstractfactory;

public class AmericanComicFactory implements ComicFactory {

	@Override
	public Ballons createBallons() {
		// TODO Auto-generated method stub
		return new BlueBallons();
	}

	@Override
	public Caption createCaptions() {
		// TODO Auto-generated method stub
		return new HugeCaptions();
	}

	@Override
	public Panel createPanels() {
		// TODO Auto-generated method stub
		return new BottomPanel();
	}

	@Override
	public Text createText() {
		// TODO Auto-generated method stub
		return new USAText();
	}

}
