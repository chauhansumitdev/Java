package Recursion;
import java.util.*;

/**
 *  Input: [1, 1, 2]
 * Output: [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
 *
 */

public class UniquePermutation {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();

        int[] arr = {1, 1, 2};

        permutation(arr, new boolean[arr.length], result, new ArrayList<>());

        System.out.println(result);
    }

    public static void permutation(int arr[], boolean map[], List<List<Integer>> result, List<Integer> current){
        if(current.size() == arr.length){
            result.add(new ArrayList<>(current));
        }

        for(int i=0;i<arr.length;i++){
            if(map[i] || (i>0 && arr[i] == arr[i-1] && !map[i-1])){
                continue;
            }

            map[i] = true;
            current.add(arr[i]);
            permutation(arr, map, result, current);
            map[i]= false;
            current.remove(current.size()-1);
        }
    }
}
