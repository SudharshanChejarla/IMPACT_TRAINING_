package Week4.Day2;

public class PowerOfNum {
    public static void main(String[] args) {
        int ans = findPower(2,3) ; // x^y
        System.out.println(ans);
    }

    static int findPower(int x , int y) {
        if(y==0 ) {
            return 1 ;
        } 
        if(x==0) {
            return 0 ;
        }

        return x* findPower(x,y-1);
    }
}
