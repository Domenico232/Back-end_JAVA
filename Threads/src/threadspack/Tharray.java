package threadspack;

public class Tharray extends Main implements Runnable {
	long num1;
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			num1 += array3k[i];
		}
		System.out.println(num1);
	}

}
