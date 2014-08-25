package logic;

import java.io.*;
import java.util.*;
import data.ObjectFactory;

 

public class MainLogic { // in Mooshak online judge, make sure that Java file name = class name that contains Main method

    //attributes

    //constructors
    public MainLogic() {
    }

    //procedure call
    public ArrayList start() {
        //Start Circular : return ArrayList
        //Pass ArrayList into KeywordVerifier : return ArrayList
        //Pass ArrayList into Alphabetizer : return ArrayList
        //Pass ArrayList into Formatter : return ArrayList
        return (ObjectFactory.getDataStorage().getTitles());
    }
  
}