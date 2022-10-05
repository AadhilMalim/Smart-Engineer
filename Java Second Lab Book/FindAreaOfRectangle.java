import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th length of the rectangle : ");
		double length = sc.nextDouble();
		System.out.println("Enter th width of the rectangle : ");
		double width = sc.nextDouble();
		double area = length * width;
		System.out.format("Area of the rectangle is :  " + area);


	}

}
