import java.util.Scanner;
public class SquareOfNumber{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to be squared");
		int n = input.nextInt();
		System.out.println("Square of " + n + " is  " + n*n);

	}

}
