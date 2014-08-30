import java.util.*;
import java.io.*;

public class CircularShiftFilter extends Filter<DataContainer> {
	@Override
	DataContainer execute(DataContainer data) {

		ArrayList<String> titles = data.getTitles();
		int numTitles = titles.size();

		for(int i = 0; i < numTitles; i++) {
			circularShift(titles, titles.get(i));
		}

		return data;
	}

	private void circularShift(ArrayList<String> titles, String titleToShift) {
		int index = titleToShift.indexOf(' ', 0);
		while (index != -1) {
			String newString = titleToShift.substring(index+1).concat(" " + titleToShift.substring(0,index));
			index = titleToShift.indexOf(' ', index+1);
			titles.add(newString);
		}
	}
}
