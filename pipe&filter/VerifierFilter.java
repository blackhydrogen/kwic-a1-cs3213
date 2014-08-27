package kkk;

public class VerifierFilter extends Filter<String> {

	@Override
	String execute(String obj) {
		return "verifier " + obj;
	}

}
