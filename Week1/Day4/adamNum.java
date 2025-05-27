import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n Value : ");
    int n = sc.nextInt();
    int square = n * n;

    int rev = reverseNum(n);
    int squarOfRev = rev * rev;

    if (reverseNum(squarOfRev) == square) {
      System.out.println("Adams Number");
    } else {
      System.out.println("Not an Adams Number");
    }
  }

  static int reverseNum(int n) {
    int rev = 0;
    while (n > 0) {
      int digit = n % 10;
      rev = (rev * 10) + digit;
      n = n / 10;
    }
    return rev;
  }
}