package stackAndHeap;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 
 * @author zhiwenyan
 *
 * @param <T>
 *            java顺序队列的实现
 */
public class ArrayQueue<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private int DEFAULT_SIZE = 2;
	private int capacity;// 保存数组的长度
	private Object[] elementData;// 定义一个数组用于保存顺序队列的元素
	private int front = 0; // 对头
	private int rear = 0; // 对尾

	// 以默认数组长度创建空顺序队列
	public ArrayQueue() {
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}

	// 以一个初始化元素来创建顺序队列
	public ArrayQueue(T element) {
		this();
		elementData[0] = element; // 指定一个元素
		rear++;
	}

	public ArrayQueue(int initSize) {
		elementData = new Object[initSize];
	}

	public ArrayQueue(T element, int initSize) {
		this.capacity = initSize;
		elementData = new Object[capacity];
		elementData[0] = element;
		rear++;
	}

	// 获取顺序队列的大小
	public int size() {
		return rear - front;
	}

	// 入队
	public void offer(T element) {
		ensureCapacity(rear + 1);
		elementData[rear++] = element;
	}

	private void ensureCapacity(int minCapacity) { // 数组扩容
		// 如果数组的原有长度小于目前所需的长度
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			elementData = Arrays.copyOf(elementData, newCapacity);
			// if (newCapacity < minCapacity) {
			// newCapacity = minCapacity;
			// // minCapacity is usually close to size, so this is a win:
			// }
		}
	}

	// 出队
	public T poll() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("空队列异常");
		}
		// 保留队列的front端的元素的值
		T oldValue = (T) elementData[front];
		// 释放队列的front端的元素
		elementData[front++] = null;
		return oldValue;
	}

	/**
	 * @Title: clear
	 * @Description: 清空顺序队列
	 */
	public void clear() {
		// 将底层数组所有元素赋为null
		Arrays.fill(elementData, null);
		front = 0;
		rear = 0;
	}

	public String toString() {
		if (isEmpty()) {
			return "[]";
		} else {
			StringBuilder sb = new StringBuilder("[");
			for (int i = front; i < rear; i++) {
				sb.append(elementData[i].toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2, len).append("]").toString();
		}
	}

	/**
	 * @Title: isEmpty
	 * @Description: 判断顺序队列是否为空队列
	 * @return
	 */
	public boolean isEmpty() {
		return rear == front;
	}

	public static void main(String[] args) {
		ArrayQueue<String> arrayQueue = new ArrayQueue<>();
		arrayQueue.offer("1");
		arrayQueue.offer("2");
		arrayQueue.offer("3");
		 arrayQueue.poll();
		System.out.println(arrayQueue.toString());
	}

}
