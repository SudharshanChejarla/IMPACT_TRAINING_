public class DecToBin {
  public static void main(String[] args) {
    int n = 16 ;
    int count = 1 ;
    int binary = 0 ;

    while(n!=0) {
      int rem = n%2 ;
      n = n/2 ;  
      binary = (rem*count) + binary;
      count *= 10 ;
    }
  
    System.out.println(binary);
  }
}
