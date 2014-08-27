package kkk;


public class Main {
	public static void main(String args[]) {
		FormatFilter f1 = new FormatFilter();
		VerifierFilter f2 = new VerifierFilter();
		OutputFilter f3 = new OutputFilter();

		new Pipe<String>(f1, f3);
		new Pipe<String>(f1, f2);
		new Pipe<String>(f2, f3);
		f1.inputData("hello");
	}
}
