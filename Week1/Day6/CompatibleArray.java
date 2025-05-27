package Day6;

import java.util.Scanner;
public class CompatibleArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the first array");
    int n1 = sc.nextInt();
    System.out.println("Enter the size of the second array");
    int n2 = sc.nextInt();

    int[] arr1 = new int[n1];
    int[] arr2 = new int[n2];

    System.out.println("Enter array elemnts for arr1 : ");
    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }

    System.out.println("Enter array elemnts for arr2 : ");
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }

    boolean yes = checkCompatible(arr1, arr2);
    if (yes) {
      System.out.println("Compatible");
    } else {
      System.out.println("Not Compatible");
    }

  }

  static boolean checkCompatible(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length)
      return false;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] < arr2[i])
        return false;
    }
    return true;
  }
}
