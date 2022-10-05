import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		for (int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + " is a Prime number .");
		}
		else {
			System.out.println(num + " is not a Prime number .");

		}

	}

}
