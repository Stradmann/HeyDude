import java.util.Scanner;

public class CalculatingTheCircumference {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Give the radius of circumference:");
		double radius = Double.valueOf(read.nextLine());
		double circumference = 2 * Math.PI * radius;
		
		System.out.println("Circumference of the circle: " + circumference);
		
		read.close();
	}
}
