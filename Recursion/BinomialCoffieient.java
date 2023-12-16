package Recursion;
import java.util.*;

/**
 * binomial coff ->
 * c(n,r) => n!/r!*(n-r)!
 */

public class BinomialCoffieient {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = obj.nextInt();
        
        System.out.println("Enter the value of r");
        int r= obj.nextInt();

        int result = factorial(n)/(factorial(r)*(factorial(n-r)));

        System.out.println("The result is: "+result);

        obj.close();
        
    }

    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
