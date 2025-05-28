package Week4.Day2;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(printFactorial(6));
    }

    static int printFactorial(int n) {
        if(n==0 || n==1 ) {
            return 1 ;
        } else {
            return (n*printFactorial(n-1)) ;
        }



    }
}
