import java.util.*;

public class FormatFilter extends Filter<DataContainer> {
	@Override
	DataContainer execute(DataContainer data) {
		
		ArrayList<String> titles = data.getTitles();
		for(int i = 0; i < titles.size(); i++) {
			titles.add(format(titles.remove(0)));			
		}

		return data;
	}

	private String format(String title) {
		int index = title.indexOf(' ');
		
		if(index == -1)
      return title.toUpperCase();
    else
      return title.toUpperCase().substring(0,index).concat(title.substring(index).toLowerCase());
	}
}
