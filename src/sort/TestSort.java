package sort;

public class TestSort {
	int a[] = { 12, 11, 55, 66, 78, 10, 9, 90, 100 };

	// 冒泡排序
	/**
	 * 每相邻2个数比较
	 * 
	 * 时间复杂度 n^2
	 */
	public void bubble_sort() {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("-------冒泡排序------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "-");
		}
		System.out.println();
	}

	// 选择排序
	/**
	 * 设所排序序列的记录个数为n，i 取 1,2,…,n-1 。 从所有n-i+1个记录（Ri,Ri+1,…,Rn）中找出排序码最小（或最大）的记录，
	 * 与第i个记录交换。执行n-1趟 后就完成了记录序列的排序。
	 */
	public void simpleSort() {
		int temp;
		int min; // 最小索引的位置
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					min = j;
				}
			}
			if (min != i) {
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		System.out.println("-------选择排序------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "-");
		}
		System.out.println();
	}
	
	//直接插入排序法
	
	public void insertSort1() {
		int i, j;
		int n = a.length;
		int target;
		// 假定第一个元素被放到了正确的位置上
		// 这样，仅需遍历1 - n-1
		for (i = 1; i < n; i++) {
			j = i;
			target = a[i];
			while (j > 0 && target < a[j - 1]) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = target;
		}
	}
	// 插入排序
	public void insertSort() {

		 int tmp;
	        for (int i = 1; i < a.length; i++) {
	            for (int j = i; j > 0; j--) {
	                if (a[j] < a[j - 1]) {
	                    tmp = a[j - 1];
	                    a[j - 1] = a[j];
	                    a[j] = tmp;
	                }
	            }
	        }
		System.out.println("-------插入排序------");
		for (int m = 0; m < a.length; m++) {
			System.out.print(a[m] + "-");
		}
		System.out.println();
	}

	// 希尔排序
	public void shellSort() {

	}

	public static void main(String[] args) {
		TestSort sort = new TestSort();
		sort.bubble_sort();
		sort.simpleSort();
		sort.insertSort();
	}

}
