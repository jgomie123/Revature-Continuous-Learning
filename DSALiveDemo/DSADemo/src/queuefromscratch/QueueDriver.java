package queuefromscratch;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleQueue myQueue = new SimpleQueue(9);
		
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(12);
		myQueue.insert(44);
		myQueue.insert(50);
		myQueue.insert(9999);
		myQueue.insert(500);
		myQueue.insert(245);
		myQueue.insert(1);
		myQueue.view();

		myQueue.insert(3000);
		
		myQueue.view();
//		myQueue.remove();
//		myQueue.view();
		
		Queue<Integer> nums = new LinkedList<>();
		
	}

}
