package Recursion;
import java.util.*;

/**
 * Example:
 * Input: candidates = [2, 3, 6, 7], target = 7
 * Output: [[7], [2, 2, 3]]
 */

public class TargetSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = obj.nextInt();

        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        //call the fn;
        // display the result

        obj.close();
    }

    public static void sum(){
        
    }
}
