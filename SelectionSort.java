package patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {1, 3, 5, 2, 4};
        sort(arr, 0, arr.length,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr, int start, int end, int max){
        if(end==0){
            return;
        }
        if(start<end) {
            if (arr[start] > arr[max]) {
                sort(arr, start+1, end, start);
            }else
                sort(arr, start+1, end, max);
        }
        else{
            swap(arr,max,end-1);
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
