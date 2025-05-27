package Week3.Day2; 
import java.util.Scanner; 

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter String : "); 
        String str = sc.next();
        System.out.print("Enter character : ");
        char ch = (sc.next()).charAt(0) ;

        int count = countFrequency(str , ch); 
        System.out.println("Frequency Count : "+count); 

    }

    static int countFrequency(String str , char ch) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) count++;
        }
        return count ;
    }
}
