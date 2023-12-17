package Sorting;
import java.util.*;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 11, 22};
        System.out.println(Arrays.toString(insertion(arr)));
    }

    public static int[] insertion(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int val = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = val;
        }

        return arr;
    }
}
