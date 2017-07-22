
public class Application {

	public static void main(String[] args) {

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);

		thread1.start();
		thread2.start();
	}
}
