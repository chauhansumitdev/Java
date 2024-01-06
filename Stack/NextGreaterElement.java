package Stack;

import java.util.Arrays;

/*
 * Example:
 * Input: [4, 5, 2, 10, 8]
 * Expected Output: [5, 10, 10, -1, -1]
 * Explanation: For each element in the array, the next greater element to its right is found.
 */

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        int[] result = findNextGreaterElement(nums);

        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Next greater elements: " + Arrays.toString(result));
    }

    public static int[] findNextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int currVal = nums[i];
            boolean found = false;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > currVal) {
                    result[i] = nums[j];
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[i] = -1;
            }
        }

        return result;
    }
}
