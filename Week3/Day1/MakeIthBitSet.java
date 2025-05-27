package Week3.Day1;


public class MakeIthBitSet {
    public static void main(String[] args) {
        int binary = 21; //21
        int i = 3 ;

        int res = ((binary )| (1<<i)) ;
        System.out.println(Integer.toBinaryString(res)+ " Decimal--"+res);

    }
}
