package Recursion;

/**
 * Factorial
 */

import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int val = obj.nextInt();

        int result = factorial(val);
        
        System.out.println(result);

        obj.close();
        
    }

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }

        return num*factorial(num-1);
    }
}