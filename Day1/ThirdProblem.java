import java.util.Scanner;

public class ThirdProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num value : ");
		int num = sc.nextInt();

		int lastDigit = num % 10;
		int firstDigit = num / 1000;

		System.out.println(lastDigit + firstDigit);

	}
}
