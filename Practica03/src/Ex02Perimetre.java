import java.util.Scanner;

public class Ex02Perimetre {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String selection = null;
		while(true) {
			System.out.println("Perímetre de que?(triangle, quadrat, rectangle, quit)");
			selection = read.nextLine();
			boolean exitWhile = false;
			switch(selection) {
			case "triangle":
				System.out.println("Perimetre: " + trianglePerimeter());
				exitWhile = true;
				break;
				
			case "quadrat":
				System.out.println("Perimetre: " + squarePerimeter());
				exitWhile = true;
				break;
				
			case "rectangle":
				System.out.println("Perimetre: " + rectanglePerimeter());
				exitWhile = true;
				break;
				
			case "quit":
				exitWhile = true;
				break;
				
				default:
					break;
			}
			if (exitWhile) {
				break;
			}else {
				continue;
			}
		}
		read.close();
	}
	
	public static double trianglePerimeter() {
		Scanner read = new Scanner(System.in);
		System.out.println("Es equilater?(Y)es, (N)o");
		String ans = read.nextLine();
		double result = 0;
		if (ans.equals("Y")) {
			System.out.println("Mida de un costat:");
			double side = Double.valueOf(read.nextLine());
			result = side * 3;
		}
		if (ans.equals("N")) {
			System.out.println("Mida del primer costat:");
			double side1 = Double.valueOf(read.nextLine());
			System.out.println("Mida del segon costat:");
			double side2 = Double.valueOf(read.nextLine());
			System.out.println("Mida del tercer costat:");
			double side3 = Double.valueOf(read.nextLine());
			result = side1 + side2 + side3;
		}
		read.close();
		return result;
		
	}
	
	public static double squarePerimeter() {
		Scanner read = new Scanner(System.in);
		System.out.println("Mida de un costat:");
		double side = Double.valueOf(read.nextLine());
		read.close();
		return side * 4;
	}
	
	public static double rectanglePerimeter() {
		Scanner read = new Scanner(System.in);
		System.out.println("Mida de l'alçada:");
		double sideY = Double.valueOf(read.nextLine());
		System.out.println("Mida de l'amplada:");
		double sideX = Double.valueOf(read.nextLine());
		read.close();
		return (2 * sideX) + (2 * sideY);
	}
}
