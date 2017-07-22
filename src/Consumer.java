
public class Consumer implements Runnable{
	private Buffer buffer;

	public Consumer() {
		buffer = Buffer.getInstance();
	}

	@Override
	public void run() {
		while(true){
			buffer.take();
		}
	}

}
