import java.util.Scanner;
public class KaprekarNum {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter n val : ");
    int n = sc.nextInt();
    int given = n ;
    int sqaure = n*n ;
    int count = 0 ;
    while(n>0) {
      n = n/10 ;
      count++ ;
    }

    int sum = findKaprekar(sqaure,count);
    if(sum == given) {
      System.out.println("Number is Kaprekar");
    } else {
      System.out.println("Not a Kaprekar Number");
    }
  }

  static int findKaprekar(int num,int count) {
    // int given = num ;
    int rev = 0 ;
    while(count!=0) {
      int digit = num%10 ;
      rev = (rev*10) + digit ;
      num = num/10 ;
      count-- ;
    }

    int finalRev = findReverse(rev);

    return finalRev+num ;


  }

  static int findReverse(int n) {
    int rev = 0 ;
    while(n>0) {
      int digit = n%10 ;
      rev = (rev*10) + digit ;
      n = n/10 ;
      // count-- ;
    }
    return rev ;
  }
}
