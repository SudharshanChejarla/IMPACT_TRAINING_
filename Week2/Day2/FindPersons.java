package Week2.Day2;

import java.util.Scanner;

public class FindPersons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Persons: ");
        int n = sc.nextInt();
        System.out.println("Enter Array elements (Height at even idx ,weight at odd): ");
        int[] arr = new int[2 * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        findPersons(arr);

    }

    static void findPersons(int[] arr) {
        int x = arr.length;
        int maxWeightIdx = x - 1;
        int maxHeightIdx = x - 1;
        int maxWeight = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = x - 1; i >= 0; i--) {
            if (i % 2 != 0) { // weight
                if (arr[i] >= maxWeight) {
                    maxWeight = arr[i];
                    maxWeightIdx = (i / 2) + 1;
                }
            } else { // height
                if (arr[i] >= maxHeight) {
                    maxHeight = arr[i];
                    maxHeightIdx = (i / 2) + 1;
                }
            }
        }

        System.out.println("Number of Maximum Height Person : " + maxHeightIdx + " -> " + maxHeight);
        System.out.println("Number of Maximum Weight Person : " + maxWeightIdx + " -> " + maxWeight);

    }
}
