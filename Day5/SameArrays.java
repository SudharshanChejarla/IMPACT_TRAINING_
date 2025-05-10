package Day5;

public class SameArrays {
  public static void main(String[] args) {
    int[] arr1 = {0,3,5,1,2};
    int[] arr2 = {1,2,5,2,1};

    if(findSame(arr1,arr2)) {
      System.out.println("Arrays are same");
    } else {
      System.out.println("Arrays are not same");
    }
  }

  static boolean findSame(int[] arr1,int[] arr2) {
    if(arr1.length != arr2.length) return false;
    int sum1 = 0;
    int sum2 = 0;
    for(int i=0; i<arr1.length; i++) {
      sum1 += arr1[i];
      sum2 += arr2[i];
    }

    if(sum1 == sum2) return true ;

    return false ;
  }
}
