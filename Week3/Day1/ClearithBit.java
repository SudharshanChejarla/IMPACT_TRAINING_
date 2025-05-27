package Week3.Day1;

public class ClearithBit {
    public static void main(String[] args) {
        int binary = 0b10101 ;
        int i =2 ;

        // if(CheckIthBitIs1(binary,i)) {
        //     int res = binary ^ (1<<i) ; // XOR 
        //     System.out.println(Integer.toBinaryString(res) + " Decimal-- " +res);
        // } else {
        //     System.out.println("Ith bit is 0");
        // }

        int res = ~(1<<i) & binary ;
        System.out.println(Integer.toBinaryString(res) + " Decimal-- " +res);
        
    }

    // static boolean CheckIthBitIs1(int binary,int i) {
    //     int res = binary>>i & 1; 
    //     return res ==1;
    // }
}
