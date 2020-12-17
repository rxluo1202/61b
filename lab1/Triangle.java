public class Triangle {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i += 1) {
			for (j = 1; j < i; j += 1) {
			System.out.print("*");
			}
		System.out.println("*"); 
		}
	}
}/*注意第4行自增是i += 1，而不是i += i。


			
/*参考答案*//*
public class Triangle {
	public static void main(String[] args) {
		int x = 1;
        int j = 1;
		while (x <= 5) {
			j = 1;
			while (j < x) {
				System.out.print("*");
				j = j + 1;
			}
		System.out.println("*"); 
		x = x + 1;
		}
	}
}
*/