package stackAndHeap;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> mQueue = new LinkedList<>();	
		mQueue.offer("1");
		mQueue.offer("2");
		mQueue.offer("3");
		for (String string : mQueue) {

			System.out.println(string);
		}
	}

}
