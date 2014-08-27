package kkk;

public class Pipe<Datatype> {
	private Filter<Datatype> inputFilter;
	private Filter<Datatype> outputFilter;
	public Pipe() {
		inputFilter = null;
		outputFilter = null;
	}
	public Pipe(Filter<Datatype> input, Filter<Datatype> output) {
		setInputFilter(input);
		setOutputFilter(output);
	}

	public Filter<Datatype> getInputFilter() {
		return inputFilter;
	}

	public void setInputFilter(Filter<Datatype> f) {
		f.registerOutputPipe(this);
		inputFilter = f;
	}

	public void setOutputFilter(Filter<Datatype> f) {
		outputFilter = f;
	}

	public void inputData(Datatype data) {
		outputFilter.inputData(data);
	}
}
