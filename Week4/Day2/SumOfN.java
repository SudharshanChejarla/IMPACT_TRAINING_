package Week4.Day2;

public class SumOfN {
    public static void main(String[] args) {
        int n = 10 ;
        System.out.println(findSum(n));
    }

    static int findSum(int n) {
        if(n==1) return 1 ;

        return n+findSum(n-1);
    }
}
