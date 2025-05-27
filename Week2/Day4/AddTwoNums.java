package Week2.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 Val : ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 Val : ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.print("Enter arr1 vals: ");
        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter arr2 vals: ");
        for(int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // int a = findNumInArray(arr1);
        // int b = findNumInArray(arr2);

        int[] reqArray = findSum(arr1,arr2,n1,n2);

        System.out.println(Arrays.toString(reqArray));


    }

    static int[] findSum(int[] arr1,int[] arr2,int n1,int n2) {
        int x= n1-1 ;
        int y = n2-1 ;
        int size= 0;
        if(n1>=n2) {
            size += (n1+1) ;
        } else {
            size += (n2+1) ;
        }


        int[] reqArray = new int[size];
        int p = 0 ;

        int borrow = 0;
        int sum = 0 ;
        while(x>=0 && y>=0) {
            sum = arr1[x--]+arr2[y--]+borrow;
            borrow = sum/10 ;
            reqArray[p++] = sum%10 ;  
        }

        while(x>=0) {
            sum = arr1[x--]+borrow ;
            borrow = sum/10 ;
             reqArray[p++] = sum%10 ;
        }

        while(y>=0) {
            sum = arr2[y--]+borrow ;
            borrow = sum/10 ;
             reqArray[p++] = sum%10 ;
        }

        reqArray[p] = reqArray[p]+borrow ;
        
        //Maintaining array size
        int[] formatedArray = new int[size-1];
        int tracker = 0;
        if(reqArray[p] == 0) {
            for(int i=0; i<size-1; i++) {
                formatedArray[tracker++] = reqArray[i];
            }
            return formatedArray ;
        }

        return reqArray ;
     }

    

}
