package Recursion;
import java.util.*;

/**
 * problem explanation ->
 * given an array, write all the possible combinations
 * eg ->
 * input -> [1, 2, 3]
 * output -> [[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
 */

public class Combinations {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = obj.nextInt();

        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = obj.nextInt();
        }
        
        // call the function
        List<List<Integer>> result = new ArrayList<>();
        combination(0, arr, result, new ArrayList<>());

        System.out.println(result); // dsplaying the result all together

        // displaying the individual list inside result;
        System.out.println("The resulting combinations are");
        for(List<Integer> combinations : result) {
            System.out.println(combinations);
        }
        obj.close();
    }

    // problem mapped to -> backtracking :)
    // solving using backtracking
    public static void combination(int index, int arr[], List<List<Integer>> result, List<Integer> current) {
        result.add(new ArrayList<>(current));

        for(int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            combination(i + 1, arr, result, current);
            current.remove(current.size() - 1);
        }
    }
}
