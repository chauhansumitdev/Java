package Recursion;
import java.util.*;

/**
 * NextPermutation
 * Input: [1,2,3]
 * Output: [1,3,2]
 */

public class NextPermutation {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3};

        System.out.println(Arrays.toString(permutation(arr)));
        
    }

    // there are two solutions for this 
    //1-> brute force like generating all the permutations and then sorting out 
    // the result to just find out the next permutation
    // for this brute for soultion refer to the two solved problems
    // StringPermutation and UniquePermutation
    // 2-> this is more optimised -> O(n).

    // intuition & approach
    // start form back and then find the next smaller element
    // at that place find the element on the left of it that is just greater than  that and replace it
    //relace it with that number and sort the left portion.

    public static int[] permutation(int arr[]){

        int length = arr.length;

        int min =-1;

        for(int i=length-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                min = i;
                break;
            }
        }

        if(min == -1){   // edge case if the entire array is in descending order.
            Arrays.sort(arr);
            return arr;
        }

        for(int i=length -1;i>=0;i--){
            if(arr[i] > arr[min]){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        Arrays.sort(arr,min+1,length);
        return arr;        
    }
}