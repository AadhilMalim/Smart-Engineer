import java.util.Scanner;
public class FindAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner canon = new Scanner(System.in);
		System.out.println("Enter side of square : ");
		double side = canon.nextDouble();
		double area = side*side;
		System.out.println("The Area of the square is : " + area);

	}

}
