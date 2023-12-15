package Recursion;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int val = obj.nextInt();

        int result = fib(val);

        System.out.println(result);

        obj.close();
    }

    public static int fib(int num) {
        if (num <= 1) {
            return num;
        }

        return fib(num - 1) + fib(num - 2);
    }
}
