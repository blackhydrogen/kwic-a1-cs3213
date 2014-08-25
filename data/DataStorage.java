package data;

import java.io.*;
import java.util.*;

 

public class DataStorage { // in Mooshak online judge, make sure that Java file name = class name that contains Main method

    //attributes
    private ArrayList<String> titles;
    private ArrayList<String> nonKeywords;

    //constructors
    public DataStorage() {
        titles = new ArrayList<String>();
        nonKeywords = new ArrayList<String>();
    }

    //setters
    public void addTitle(String newTitle) {
        titles.add(newTitle);
    }

    public void addNonKeyword(String newNonKeyword) {
        nonKeywords.add(newNonKeyword);
    }

    //getters
    public ArrayList getTitles() {
        return titles;
    }

    public ArrayList getNonKeywords() {
        return nonKeywords;
    }

}