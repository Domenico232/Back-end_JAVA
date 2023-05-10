package threadspack;

public class Tharray2 extends Main implements Runnable {
	long num1;
	
	@Override
	public void run() {
		for (int i = 2000; i < 3000; i++) {
			num1 += array3k[i];
		}
		System.out.println(num1);
	}
	
} 