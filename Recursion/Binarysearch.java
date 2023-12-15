package Recursion;
import java.util.*;

public class Binarysearch {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the target element -> ");
        int target = obj.nextInt();

        System.out.println("Enter the size of the array ->");
        int size = obj.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array ->");
        for(int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Result using the iterative way -> " + iterativeBinarySearch(arr, target));

        System.out.println("Result using the recursive way -> " + recursiveBinarySearch(arr, target,0,arr.length-1));

        obj.close();
    }

    // iterative binary search;
    public static int iterativeBinarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1; 
            }
        }

        return -1; // elem not found;
    }

    // recursive binary search

    public static int recursiveBinarySearch(int arr[], int target, int left, int right) {

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
        
            if (target < arr[mid]) {
                return recursiveBinarySearch(arr, target, left, mid - 1);
            } else {
                return recursiveBinarySearch(arr, target, mid + 1, right);
            }
        }

        return -1;
    }    

}
