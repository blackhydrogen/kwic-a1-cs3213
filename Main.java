import java.util.*;

public class Main {
	public static void main(String args[]) {

		InputFilter f1 = new InputFilter();
		CircularShiftFilter f2 = new CircularShiftFilter();
		VerifierFilter f3 = new VerifierFilter();
		SorterFilter f4 = new SorterFilter();
		FormatFilter f5 = new FormatFilter();
		OutputFilter f6 = new OutputFilter();

		new Pipe<DataContainer>(f1, f2);
		new Pipe<DataContainer>(f2, f3);
		new Pipe<DataContainer>(f3, f4);
		new Pipe<DataContainer>(f4, f5);
		new Pipe<DataContainer>(f5, f6);

		DataContainer data = new DataContainer();

		f1.inputData(data);
	}
}
