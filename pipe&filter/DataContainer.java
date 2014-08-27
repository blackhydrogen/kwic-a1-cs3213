import java.util.*;

public class DataContainer {
	//Attributes
	private ArrayList<String> titles;
	private ArrayList<String> nonKeywords;

	//Constructor
	public DataContainer() {
		titles = new ArrayList<String>();
		nonKeywords = new ArrayList<String>();
	}

	//Getters
	public ArrayList getTitles() {
		return this.titles;
	}

	public ArrayList getNonKeywords() {
		return this.nonKeywords;
	}

	//Setters
	public void setTitles(ArrayList titles) {
		this.titles = titles;
	}

	public void setNonKeywords(ArrayList nonKeywords) {
		this.nonKeywords = nonKeywords;
	}

}
