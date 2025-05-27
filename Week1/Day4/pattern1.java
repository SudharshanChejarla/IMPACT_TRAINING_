public class pattern1 {
  public static void main(String[] args) {
    int row = 3 ;
    int col = 3 ;
    int count = 1 ;
    for(int i=1; i<=row; i++) {
      for(int j=1; j<=col; j++) {
        System.out.print(count+" ");
        count++;
      }
      System.out.println();
    }
  }
}
