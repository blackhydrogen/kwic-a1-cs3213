import java.util.*;
import java.io.*;

public class VerifierFilter extends Filter<DataContainer> {
	@Override
	DataContainer execute(DataContainer data) {

		ArrayList<String> titles = data.getTitles();
		ArrayList<String> nonKeywords = data.getNonKeywords();

		keywordVerifier(titles, nonKeywords);

		return data;
	}

	private void keywordVerifier(ArrayList<String> titles, ArrayList<String> nonKeywords) {
		//Think of a better algo
		ArrayList<Integer> indexesToDelete = new ArrayList<Integer>();
		for(int i = 0; i < nonKeywords.size(); i++) {
			for (int j = 0; j < titles.size(); j++) {
				String currentTitle = titles.get(j);
				String[] words = currentTitle.split("\\s");
				if (words[0].toLowerCase().equals(nonKeywords.get(i).toLowerCase())) {
					indexesToDelete.add(j);
				}
			}
		}

		Collections.sort(indexesToDelete);
		//System.out.println("indexesToDelete: " + indexesToDelete);
		for(int i = indexesToDelete.size()-1; i >= 0; i--) {
			int deleteThis = indexesToDelete.get(i);
			//System.out.println("Deleting index: " + deleteThis);
			titles.remove(deleteThis);
		}

	}

}
