public class Buffer {
	private boolean empty = true;
	private static Buffer instance = null;

	public synchronized void put() {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = false;
		System.out.println("THREAD1: Put an item in the buffer.");
		notifyAll();
	}

	public synchronized void take() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		System.out.println("THREAD2: Received an item");
		notifyAll();
	}

	public static Buffer getInstance() {
		if (instance == null) {
			instance = new Buffer();
		}
		return instance;
	}

}
