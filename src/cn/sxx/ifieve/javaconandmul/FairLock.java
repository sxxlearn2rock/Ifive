package cn.sxx.ifieve.javaconandmul;

import java.util.ArrayList;
import java.util.List;

public class FairLock {
	private boolean isLocked = false;
	private Thread lockingThread = null;
	private List<QueueObject> waitingThreads = new ArrayList<>();
	
	public void lock(){
		QueueObject queueObject = new QueueObject();
		boolean isLockedForThisThread = true;
		synchronized (this) {
			waitingThreads.add(queueObject);
		}
		
		while(isLockedForThisThread){
			synchronized (this) {
				
			}
		}
	}
}
