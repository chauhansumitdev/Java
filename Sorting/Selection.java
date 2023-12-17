package Sorting;
import java.util.*;

// smaller at first
// selecting out the smallest from the right subarray

public class Selection {
    public static void main(String[] args) {

        int arr[] = { 1,4,0,2,1};

        System.out.println(Arrays.toString(selection(arr)));
        
    }

    public static int[] selection(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }
}
