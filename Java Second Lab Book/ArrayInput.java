import java.util.Scanner ;
public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner arrscan = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elements : ");
		for(int i=0; i<10; i++) {
			array[i]=arrscan.nextInt();
		}
		for(int num : array) {
			sum+=num;
		}
		System.out.println("The sum of array elements is : " + sum );

	}

}
