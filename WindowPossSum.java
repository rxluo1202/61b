public class WindowPossSum {
	public static void Replace(int[] a,int n) {
		int i, j;
		for (i = 0; i < a.length; i += 1) {
			if (a[i] < 0) {
			continue;
			}
			for (j = 1; j <= n; j += 1) {
				if (i + j >= a.length) {
				break;
				}
			a[i] = a[i] + a[i+j];
			}
			//System.out.print(a[i]);
		}
	}/*第9行要考虑等于的情况*/
	
	public static void main(String[] args) {
		int[] a = {1,2,-3,4,5,4};
		int n = 3;
		Replace(a,n);
		System.out.println(java.util.Arrays.toString(a));
	}
}
