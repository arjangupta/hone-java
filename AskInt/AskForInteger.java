import java.util.Scanner;

public class AskForInteger {
	public static void main (String args[]) {
		System.out.println("Enter an integer: ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.close();
		System.out.println("You entered " + n);
	}
}
