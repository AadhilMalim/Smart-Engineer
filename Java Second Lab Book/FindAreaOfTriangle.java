import java.util.Scanner;
public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner canon = new Scanner(System.in);
		System.out.println("Enter the base of the triangle : ");
		double base = canon.nextDouble();
		System.out.println("Enter the height of the triangle : ");
		double height = canon.nextDouble();
		
		double area = (base*height)/2 ;
		System.out.println("The area of the triangle is : " + area);

	}

}
