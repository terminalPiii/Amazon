package dataStructures.array;

import java.util.Arrays;

public class arrayRemoveDuplicatesSorted {
    private static int rmDup(int[] arr, int n){
        if(n==0 || n==1){
            return n;
        }
        int j =0;
        for(int i=0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 3, 3, 4, 4, 5};
        int length = arr.length;
        length = rmDup(arr, length);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i < length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
