import java.util.*;

public class SorterFilter extends Filter<DataContainer> {
	@Override
	DataContainer execute(DataContainer data) {
		Collections.sort(data.getTitles());
		return data;
	}
}
