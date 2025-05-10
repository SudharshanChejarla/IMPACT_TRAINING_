// n=n/2 and n=3n+1
import java.util.*; 
public class seq {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n Value : ");
    int n = sc.nextInt();
    
    System.out.print(n+" -> ");
    while(n!=1) {
      if(n%2==0) {
        n = n/2 ;
        System.out.print(n+" -> ");
      } else {
        n = (3*n)+1 ;
        System.out.print(n+" -> ");
      }
    }
  }
}
