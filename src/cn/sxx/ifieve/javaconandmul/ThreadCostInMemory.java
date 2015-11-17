package cn.sxx.ifieve.javaconandmul;

public class ThreadCostInMemory {
	public static void main(String[] args) {
		while (true) {
			for ( int i = 0; i < 100; i++){
				new Thread().start();
			}
		}

	}
}
