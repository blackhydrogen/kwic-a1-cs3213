import java.io.*;
import java.util.*;
import logic.MainLogic;
import data.ObjectFactory;

 

class KwicKwacKwoc { // in Mooshak online judge, make sure that Java file name = class name that contains Main method

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); //Change to BufferedReader
    int numTitles, numNonKeywords;
    String inputString = "";

    //Create ObjectFactory
    ObjectFactory objFactory = new ObjectFactory();
    
    //Read in data and store in data storage
    numTitles = sc.nextInt();
    numNonKeywords = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter Your Titles one per line: ");
    for (int i = 0; i < numTitles; i++) {
        //enter Titles into Data Storage
        objFactory.getDataStorage().addTitle(sc.nextLine());
    }

    System.out.println("Enter Your Non-keywords one per line: ");
    for (int i = 0; i < numNonKeywords; i++) {
        //enter non-keywords into Data Storage
        objFactory.getDataStorage().addNonKeyword(sc.nextLine());
    }

    //Invoke Main Logic Component
    MainLogic mainLogic = objFactory.getMainLogic();

    //Return input to user
    System.out.println(mainLogic.start()); //change to PrintWriter

  }
}