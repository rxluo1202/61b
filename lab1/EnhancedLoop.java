public class EnhancedLoop {
	public static void main(String[] args) {
		String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
		for (String s : a) {
			System.out.println(s);
			if (s.contains("horse")) {
				break;
			}
		}
	}
}
