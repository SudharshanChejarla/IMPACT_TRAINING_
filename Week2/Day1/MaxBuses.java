package Week2.Day1;
import java.util.*;


public class MaxBuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        System.out.print("Enter m value : ");
        int m = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array values : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //Find Max Buses
        int count = 0;
        int i=0;
        while(i<n) {
            boolean flag = false ;
            int sum =  0;

            while(!flag && i<n) {
                sum += arr[i];
                if(sum <=m) {
                    i++;
                } else {
                    flag=true;
                }
            }
            count++;
        }
        
        System.out.print("Buses Required : "+count);

    }
}
