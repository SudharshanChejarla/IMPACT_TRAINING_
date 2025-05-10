import java.util.Scanner;

public class Rev3Digit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num : ");
    int num = sc.nextInt();

    int l = num % 10;
    int f = num / 100;
    int m = (num / 10) % 10;

    int reverse = (l * 100) + (m * 10) + f;

    System.out.println(reverse);
  }
}
