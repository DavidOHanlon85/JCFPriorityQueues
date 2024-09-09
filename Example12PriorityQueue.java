package slideDeckChallenges;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example12PriorityQueue {

	public static void main(String[] args) throws InterruptedException {
		
		Queue<Double> q = new PriorityQueue<Double>();
		
		q.add(10.1);
		q.add(5.2);
		
		Collections.addAll(q, 16.3, 5.2, 1.1);
		
		System.out.println("Queue order : " +q);
		
		int loop = 1;
		
		while (loop <= q.size()) {
			System.out.println("Poll : " + q.poll());
			//q.remove();
			Thread.sleep(1000);
		}
		
	}

}
