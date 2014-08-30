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
	public ArrayList<String> getTitles() {
		return this.titles;
	}

	public ArrayList<String> getNonKeywords() {
		return this.nonKeywords;
	}

	//Setters
	public void setTitles(ArrayList<String> titles) {
		this.titles = titles;
	}

	public void setNonKeywords(ArrayList<String> nonKeywords) {
		this.nonKeywords = nonKeywords;
	}

}
