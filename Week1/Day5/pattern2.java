package Day5;

public class pattern2 {
  public static void main(String[] args) {
    int n = 3 ;
    // Upper half
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=i; j++) {
        System.out.print("|* ");
      }
      System.out.println();
    }

    //Bottom half
    for(int i=n-1; i>=1; i--) {
      for(int j=i; j>=1; j--) {
        System.out.print("|* ");
      }
      System.out.println();
    }
  }
}
