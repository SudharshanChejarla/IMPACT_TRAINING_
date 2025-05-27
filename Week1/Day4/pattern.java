public class pattern {
  public static void main(String[] args) {
    int row = 5 ;
    int col = 3 ;

    for(int i=1; i<=row; i++) {
      for(int j=1; j<row-1; j++) {
        System.out.print(" ");
      }
      for(int k=1; k<(2*row-1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
