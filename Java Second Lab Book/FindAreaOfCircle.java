import java.util.Scanner;
public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("The area of the circle is : " + area);
		double circumference = 2*Math.PI*radius;
		System.out.println("The circumference of the circle is :" + circumference);

	}

}
