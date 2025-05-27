import java.util.HashMap;

public class NonRepeatingSmall {
    public static void main(String[] args) {
        String str = "abccdbae" ;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i) ;
            map.put(ch,(map.getOrDefault(ch, 0))+1);
        }

        for(int i=97; i<=122; i++) {
            char ch = (char)i ;
            if(map.get(ch)==1) {
                System.out.println("Smallest Non-Repeating Letter : "+ ch);
                break;
            }
        }
    }
}
