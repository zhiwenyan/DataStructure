package stackAndHeap;

public class recursive {

	public static void main(String[] args) {
		System.out.println(Fribonacci(10));
		f(10);

	}

	private static void f(int n) {
		int f1 = 1;
		int f2 = 1;
		int f = f1 + f2;
		for (int i = 1; i <= n; i++) {
			if (i <= 2) {
				System.out.print(1 + ",");
			} else {
				f1 = f2;
				f2 = f;
				f = f1 + f2;
				System.out.print(f + ",");
			}
		}

	}

	/**
	 * 1,1,2,3,5,8,13.....
	 * 
	 * @param n
	 * @return
	 */
	public static int Fribonacci(int n) {
		if (n <= 2)
			return 1;
		else
			return Fribonacci(n - 1) + Fribonacci(n - 2);

	}

	/**
	 * 输入一个字符串，打印出该字符串中字符的所有排列。
	 * 
	 * 例如输入字符串abc，则输出由字符a、b、c 所能排列出来的所有字符串
	 * 
	 * //abc、acb、bac、bca、cab 和 cba。
	 **/
	private void swap(String str) {
		for (int i = 0; i < str.length(); i++) {
			
		}
	}
}
