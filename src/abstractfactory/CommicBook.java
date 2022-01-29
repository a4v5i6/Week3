package abstractfactory;

public abstract class CommicBook {
	String name;
	
	Ballons ballons;
	Caption caption;
	Panel panel;
	Text text;
	
	abstract void build();
	
	void print() {
		System.out.println("printing the commic book");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("----" + name + "-----\n");
		if(ballons != null) {
			result.append(ballons);
			result.append("\n");
		}
		if(caption != null){
			result.append(caption);
			result.append("\n");
		}
		if(panel != null) {
			result.append(panel);
			result.append("\n");
		}
		if(text != null) {
			result.append(text);
			result.append("\n");
		}
		return result.toString();
	}
	
}
