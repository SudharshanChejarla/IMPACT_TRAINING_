package Week4.Day1 ;
import java.util.Arrays;

class Bubblesort {

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        boolean swapped = false ;

        for(int i=0; i<=n-1; i++) { // for passes i<n
            for(int j=1; j<=n-i-1; j++) { //for comparisions j<n-i
                if(arr[j-1]>arr[j]) {
                    //swap elements
                    swap(arr,j-1,j);
                    swapped = true;
                }
            }
            if(swapped == false ) {
                break; //No swaps occurred . so array is sorted.
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 55,33,99,22,11,44};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}