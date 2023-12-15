package Recursion;
import java.util.*;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int result = sum(num);
        System.out.println(result);
        obj.close();
    }

    public static int sum(int num){
        if(num<10){
            return num;
        }
        return num%10 + sum(num/10);
    }
}
