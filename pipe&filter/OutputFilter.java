import java.util.*;

public class OutputFilter extends Filter<DataContainer> {
	@Override
	DataContainer execute(DataContainer data) {

		ArrayList<String> titles = data.getTitles();
		for(int i = 0; i < titles.size(); i++) {
			System.out.println(titles.get(i));
		}

		return null;
	}

}
