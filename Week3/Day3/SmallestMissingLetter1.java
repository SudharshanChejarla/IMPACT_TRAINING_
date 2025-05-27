public class SmallestMissingLetter1 {
    public static void main(String[] args) {
        String str = "Mango" ;
        str = str.toLowerCase() ;
        System.out.println(str);

        int strIdx = 0 ;
        for(int i=97; i<=122; i++) { //Lower case ascii
            char ch = (char)i ;
            if( (str.indexOf(ch) == -1) ) {
                System.out.println("Smallest Missing Letter : "+ ch);
                break ;
            }
        }
    }
}
