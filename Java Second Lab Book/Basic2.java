import java.util.Scanner;
public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter a number i: ");
		int i = scan.nextInt();
		
		System.out.println("Enter another number j: ");
		int j = scan.nextInt();
		
		int mul =i*j;
		
		System.out.println("The product of i, j is : " + mul);

	}

}
