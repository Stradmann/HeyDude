
public class EvenNumbers {
	public static void main(String[] args) {
		int i = 0;
		while (i < 100) {
			i++;
			boolean even = i % 2 == 0;
			if (even) {
				System.out.print(i + " ");
			}
		}
	}
}
