package Week4.Day1;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = { 55,33,99,22,11,44};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j ;
                }
            }
            swap(arr,minIndex,i);
        }
    }
}
