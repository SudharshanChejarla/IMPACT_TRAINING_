public class pattern2 {
  public static void main(String[] args) {
    int row = 6 ;
    int col = 3 ;

    for(int i=0; i<row; i++) {
      for(int j=0; j<row-i-1; j++) {
        System.out.print(" ");
      }
      for(int k=0; k<i+1; k++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
