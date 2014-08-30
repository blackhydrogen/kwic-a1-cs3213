import java.util.*;

public class InputFilter extends Filter<DataContainer> {
	@Override
	DataContainer execute(DataContainer data) {
    
    //data should be null at this point, this creating a new instance.
    data = new DataContainer();

		int numTitles, numNonKeywords;
		Scanner sc = new Scanner(System.in);

		//How many Titles?
		System.out.print("How many Titles?: ");
		numTitles = sc.nextInt();
		System.out.println("Input your " + numTitles + " titles below (one per line):");

		//Collect Titles
		sc.nextLine();
		for (int i = 0; i < numTitles; i++) {
			data.getTitles().add(sc.nextLine());
		}

		//How many Non-keywords?
		System.out.print("How many Non-keywords to ignore?: ");
		numNonKeywords = sc.nextInt();
		System.out.println("Input your " + numNonKeywords + " non-keywords below (one per line):");

		//Collect Non-Keywords
		sc.nextLine();
		for (int i = 0; i < numNonKeywords; i++) {
			data.getNonKeywords().add(sc.next());
		}

		return data;
	}
}
