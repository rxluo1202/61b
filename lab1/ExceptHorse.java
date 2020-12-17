public class ExceptHorse {
	public static void main(String[] args) {
		String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
		int i;
		for (i = 0; i < a.length; i += 1) {
			if (a[i].contains("horse")) {
				continue;
			}
			System.out.println(a[i]);
		}
	}
}