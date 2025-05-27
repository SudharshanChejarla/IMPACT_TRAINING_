package Week3.Day2;

import java.security.Key;
import java.util.HashMap;

public class FindNonRepeating {
    public static void main(String[] args) {
        int[] arr = { 3,4,4,5,5,4};
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i] , (map.getOrDefault(arr[i], 0)) +1 );
        }

        map.forEach((key,value) -> {
            if(value==1) {
                System.out.println("Non-repeating element : "+ key);
            }
        });

    }
}
