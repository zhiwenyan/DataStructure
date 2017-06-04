package stackAndHeap;

import java.io.Serializable;
import java.util.concurrent.BlockingDeque;

/**
 * 
 * @author zhiwenyan
 *
 * @param <T>
 *            java链式队列
 */
public class LinkQueue<T> implements Serializable {
	private static final long serialVersionUID = -3071708141137364568L;

	private class Node {
		private T data; // 保存节点的数据
		private Node next; // 指向下一个节点的引用

		public Node() {
		}

		public Node(T element, Node next) {
			this.data = element;
			this.next = next;
		}
	}

	private Node front; // 链列的头节点
	private Node rear; // 链列的尾节点
	private int size; // 链队列中已包含的节点数

	/**
	 * <p>
	 * Title: LinkQueue
	 * </p>
	 * <p>
	 * Description: 创建空链队列
	 * </p>
	 */
	public LinkQueue() {
		// 空链队列，front和rear都是null
		front = null;
		rear = null;
	}

	/**
	 * 
	 * @param element
	 *            链列只有一个元素
	 */
	public LinkQueue(T element) {
		front = new Node(element, null);
		// 只有一个节点，front、rear都指向该节点
		rear = front;
		size++;

	}

	public int size() {
		return size;
	}

	// 入队
	public void offer(T element) {
		if (front == null) {
			front = new Node();
			rear = front; // 只有一个节点，front、rear都指向该节点
		} else {
			Node newDode = new Node(element, null);
			rear.next = newDode;//// 让尾节点的next指向新增的节点
			rear = newDode; //// 以新节点作为新的尾节点
		}
		size++;
	}

	// 出队
	public T poll() {
		Node oldFront = front;
		if (!isEmpty()) {
			front = front.next; // 指向下一个节点
			oldFront.next = null;
			size--;
		}
		return oldFront.data;

	}

	/**
	 * @Title: peek
	 * @Description: 返回队列顶元素，但不删除队列顶元素
	 * @return
	 */
	public T peek() {
		return rear.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String toString() {
		// 链队列为空链队列时
		if (isEmpty()) {
			return "[]";
		} else {
			StringBuilder sb = new StringBuilder("[");
			for (Node current = front; current != null; current = current.next) {
				sb.append(current.data.toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2, len).append("]").toString();
		}
	}

	public static void main(String[] args) {
		LinkQueue<String> queue = new LinkQueue<String>("aaaa");
		// 添加两个元素
		// queue.offer("bbbb");
		// queue.offer("cccc");
		System.out.println(queue);
		// 删除一个元素后
		queue.poll();
		System.out.println("删除一个元素后的队列：" + queue);
		// 再次添加一个元素
		queue.offer("dddd");
		System.out.println("再次添加元素后的队列：" + queue);
		// 删除一个元素后，队列可以再多加一个元素
		queue.poll();
		// 再次加入一个元素
		queue.offer("eeee");
		System.out.println(queue);
	}

}
