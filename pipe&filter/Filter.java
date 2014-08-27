package kkk;

import java.util.Vector;

public abstract class Filter<Datatype> {
	private Vector<Pipe<Datatype>> pipes;

	public Filter() {
		pipes = new Vector<Pipe<Datatype>>();
	}

	public void inputData(final Datatype obj) {
		new Thread() {
			@Override
			public void run() {
				Datatype output = execute(obj);
				sendToOutputPipes(output);
			}
		}.start();
	}

	abstract Datatype execute(Datatype obj);

	private void sendToOutputPipes(Datatype data) {
		for(Pipe<Datatype> pipe : pipes) {
			pipe.inputData(data);
		}
	}

	protected void registerOutputPipe(Pipe<Datatype> pipe) {
		pipes.add(pipe);
	}
}
