package Recursion;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String str = obj.next();

        String result = reverse(str, "", str.length()-1);

        System.out.println(result);

        obj.close();
    }

    public static String reverse(String str, String result, int index){

        if(index < 0){
            return result;
        }

        return reverse(str,result+str.charAt(index), index-1);

    }
}
