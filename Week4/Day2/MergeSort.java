package Week4.Day2;

import java.util.*;
public class MergeSort {

    public static void divide(int[] arr , int si, int ei) {
        
        // Base Case  
        if(si >= ei) {
            return ;
        }
        
        

        int mid = si + (ei-si)/2 ; //important

        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquer(arr,si,mid,ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        //create a merged array of length ei-si+1
        int[] mergedArray = new int[ei-si+1];

        //two pointer approach - idx1 for 1st subarray and idx2 for second subarray
        int idx1 = si;
        int idx2 = mid+1;

        //variable that tracks mergedArray-> x
        int x =0;

        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2] ) {
                mergedArray[x++] = arr[idx1++];
            } else {
                mergedArray[x++] = arr[idx2++];
            }
        }

        // checking subarray from si->mid and mid+1->ei is completed or not
        while(idx1 <= mid) {
            mergedArray[x++] = arr[idx1++];
        }

        while(idx2 <= ei) {
            mergedArray[x++] = arr[idx2++];
        }

        //copy to original array ( j for original array and i for mergedArray)
        for(int j=si , i=0; i<mergedArray.length; i++,j++) {
            arr[j] = mergedArray[i];
        }
    }

    
    public static void main(String[] args) {
        int arr[] = {7,9,1,4,0,5};
        int n = arr.length;

        divide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}