package Recursion;
import java.util.*;


public class Powerfunction {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the base ->");
        int base = obj.nextInt();

        System.out.println("Enter the exponent ->");
        int power = obj.nextInt();

        int result = power(base, power);

        System.out.println(result);

        obj.close();
    }

    public static int power(int base, int power){
        if(power <=0){
            return 1;
        }
        return base*power(base,power-1);
    }
}
