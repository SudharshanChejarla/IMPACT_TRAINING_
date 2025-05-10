import java.util.Scanner ;
public class Special {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Value :");
    int a = sc.nextInt();
    System.out.println("Enter b Value :");
    int b = sc.nextInt();

    for(int i=a; i<=b; i++) {
      boolean yes = SpecailNum(i) ;
      if(yes) {
        System.out.println(i);
      }
    }
  }

  static boolean SpecailNum(int n) {
    int f = n/10 ;
    int l = n%10 ;

    if((f*l) + (f+l) == n) {
      return true ;
    }

    return false;
  }

}
