package Day6 ;
import java.util.* ;
import java.lang.Math ;
public class GoodNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size : ") ;
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements : ") ;
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        int count = 0 ;

        for(int i=0; i<n; i++) {
            if(checkGoodNum(arr[i])) {
                System.out.println(arr[i]+" is a Good Number");
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean checkGoodNum(int a) {
        int x = 1 ;
        int y = (int)(Math.cbrt(a));
        int sum = 0;
        while(x<=y) {
            sum = (int)Math.pow(x,3) + (int)Math.pow(y,3) ;
            if(sum == a) {
                break ; 
            }

            if(a > sum) x++;
            if(a < sum) y--;
        }

        if(sum == a ) return true ;

        return false ;
    }
}
