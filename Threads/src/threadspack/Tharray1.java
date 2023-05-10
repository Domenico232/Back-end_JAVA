package threadspack;

public class Tharray1 extends Main implements Runnable {
	long num1;
	
	@Override
	public void run() {
		for (int i = 1000; i < 2000; i++) {
			num1 += array3k[i];
		}
		System.out.println(num1);
	}

}