package kkk;

public class OutputFilter extends Filter<String> {

	@Override
	String execute(String obj) {
		System.out.println("output " + obj);
		return null;
	}

}
