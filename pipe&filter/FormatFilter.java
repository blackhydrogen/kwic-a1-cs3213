package kkk;


public class FormatFilter extends Filter<String> {
	@Override
	String execute(String obj) {
		return "format " + obj;
	}
}
