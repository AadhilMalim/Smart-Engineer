import java.util.Scanner ;
public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int reversenum = 0;
		System.out.println("Enter your number and press enter .");
		num = sc.nextInt();
		while(num!=0)
		{
			reversenum *= 10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		System.out.println("Reverse of the input nuber is : " + reversenum);
	}

}
