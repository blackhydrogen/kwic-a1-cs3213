package data;

import java.io.*;
import java.util.*;
import logic.*;

 

public class ObjectFactory {

    //attributes
    private static MainLogic mainLogic = null;
    private static CircularShifter circularShifter = null;
    private static Alphabetizer alphabetizer = null;
    private static KeywordVerifier keywordVerifier = null;
    private static DataStorage dataStorage = null;
    //create one of each object

    //constructors
    public ObjectFactory() {
    }

    //getters
    public static MainLogic getMainLogic() {
    	if (mainLogic == null) {
    		mainLogic = new MainLogic();
    	}
        return mainLogic;
    }
  
  	public static CircularShifter getCircularShifter() {
    	if (circularShifter == null) {
    		circularShifter = new CircularShifter();
    	}
        return circularShifter;
    }

    public static KeywordVerifier getKeywordVerifier() {
    	if (keywordVerifier == null) {
    		keywordVerifier = new KeywordVerifier();
    	}
    	return keywordVerifier;
    }

    public static Alphabetizer getAlphabetizer() {
    	if (alphabetizer == null) {
    		alphabetizer = new Alphabetizer();
    	}
    	return alphabetizer;
    }

    public static DataStorage getDataStorage() {
    	if (dataStorage == null) {
    		dataStorage = new DataStorage();
    	}
    	return dataStorage;
    }
}