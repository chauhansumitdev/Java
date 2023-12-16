package Recursion;
import java.util.*;

/**
 * Example:
 * Input: candidates = [2, 3, 6, 7], target = 7
 * Output: [[7], [2, 2, 3]]
 * 
 * - sort the array if its not
 * - dont take the repetative elements like [2,2] -> take single 2;
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

        System.out.println("Enter the target value");
        int target = obj.nextInt();

        List<List<Integer>> result = new ArrayList<>();

        sum(0,arr,target,result,new ArrayList<>());

        System.out.println(result);
        obj.close();
    }

    public static void sum(int index, int arr[], int target, List<List<Integer>> result, List<Integer> current){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i] > target){
                break;
            }

            current.add(arr[i]);
            sum(i+1,arr,target-arr[i],result,current);
            current.remove(current.size() -1);
            
        }
    }
}
