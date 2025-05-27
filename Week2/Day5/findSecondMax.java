package Week2.Day5;

public class findSecondMax {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,0,10,11};
        int firstMaxIdx = returnMaxIdx(arr);
        arr[firstMaxIdx] = Integer.MIN_VALUE ;

        int secMaxIdx = returnMaxIdx(arr);
        System.out.println("SecondMax Element : "+arr[secMaxIdx]);
    }

    static int returnMaxIdx(int[] arr) {
        int maxIdx = 0;
        int maxElm = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > maxElm) {
                maxElm = arr[i];
                maxIdx = i ;
            }
        }

        return maxIdx ;
    }
}
