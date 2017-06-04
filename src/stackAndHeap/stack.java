package stackAndHeap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

public class stack {

	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for (int i = 0; i < 10;i++) {
			stack.add(i);
		}
		
		System.out.println(stack.getLast());
		
		Vector<String> vector=new Vector<>(); //基于数组实现，线程安全
		vector.add("1");
		ArrayList<String> arrayList = new ArrayList<>(); //-->基于数组实现，非线程安全
		arrayList.add("1");
		arrayList.remove(0);
		LinkedList<String> linkedList=new LinkedList<>(); //-->基于链表实现
		linkedList.add("1");
		linkedList.remove(0);		
		Map<Object, Object> map=new HashMap<>();
		map.put(1, 1);
		
		ArrayBlockingQueue<String> arrayBlockingQueue=new ArrayBlockingQueue<>(10);
		arrayBlockingQueue.add("1");
	}

}
