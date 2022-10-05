import java.util.Scanner;
public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows ,counter, number=1, j ;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number of rows for floyds triangle: ");
		rows = input.nextInt();
		System.out.println("Floyd's Trianglge");
		System.out.println("*****************");
		
		for(counter =1; counter <=rows; counter++) {
			for(j=1; j<=counter; j++) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

}
