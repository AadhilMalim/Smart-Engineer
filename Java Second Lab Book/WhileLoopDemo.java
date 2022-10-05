import java.util.Scanner;
public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer below 10: ");
		number = sc.nextInt();
		
		while(number<=10) {
			sum += number;
			number++;
		}
		
		System.out.printf("The sum from the while loop is : %d", sum);

	}

}
