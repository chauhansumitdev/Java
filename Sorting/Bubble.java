package Sorting;
import java.util.*;

// largest at last
// compare two adjacent elements

public class Bubble {
    public static void main(String[] args) {

        int arr[] = { 1,4,0,2,1};

        System.out.println(Arrays.toString(bubble(arr)));
        
    }

    public static int[] bubble(int arr[]){

        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
