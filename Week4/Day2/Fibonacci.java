package Week4.Day2;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9 ;
        
        for(int i=0; i<n; i++) {
            System.out.print(Fibonacci(i)+ " ");
        }
    }

    static int  Fibonacci(int n) {
        if(n==0 || n==1) {
            return n ;
        } 

        return Fibonacci(n-1)+Fibonacci(n-2);
        




    }
}


