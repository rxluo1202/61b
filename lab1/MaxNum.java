public class MaxNum {
	public static int Max(int[] n) {
		int max = 0;
		int i = 0;
		while (i < n.length) {
			if (n[i] > max) {
				max = n[i];
			}
			i = i + 1;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{9,2,15,2,22,10,6};
		System.out.print(Max(a));
	}
}

		