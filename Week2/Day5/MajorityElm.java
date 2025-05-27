package Week2.Day5;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>() ;
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int reqCount = n/2 ;
        System.out.print("Enter elements : ");
        for(int i=1; i<=n; i++) {
            int elm = sc.nextInt() ;
            hm.put(elm, ( hm.getOrDefault(elm,0 ) ) +1) ;
            if(hm.get(elm) > reqCount ) {
                System.out.println("Majority Element : "+ elm);
                break ;
            }
        }
    }
}
