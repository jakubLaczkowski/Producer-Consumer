
public class Producer implements Runnable {
	private Buffer buffer;

	public Producer() {
		buffer = Buffer.getInstance();
	}

	@Override
	public void run() {
		while (true) {
			buffer.put();
		}

	}
}
