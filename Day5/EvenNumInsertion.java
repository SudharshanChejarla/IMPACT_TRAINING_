package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumInsertion {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    int[] arr = new int[11] ;
    int count = 0; 
    for(int i=0; i<=20; i++){
      if(i%2==0) {
        arr[count++] = i;
      }
      
    }

    System.out.println(Arrays.toString(arr));

  }
}
