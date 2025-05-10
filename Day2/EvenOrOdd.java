import java.util.Scanner ;6
public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num value :  ");
    int num = sc.nextInt();

    if(num%2==1) {
      System.out.println("Weird");
    } else if(num%2==0 && num>=2 && num<=5) {
      System.out.println("Not Weird");
    } else if(num%2==0 && num>=6 && num<=20) {
      System.out.println("Weird");
    } else if(num%2==0 && num>20) {
      System.out.println("Not Weird");
    }
  }
}
