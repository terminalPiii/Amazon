package dataStructures.array;

import java.util.Arrays;

public class arraySort {
    private static void insertSort(){
        //Sorting an array
        int[] sort = {5, 67, 9, 12, 1, 0, 99, 83, 37, 2, 4};
        int temp;
        for(int i=1; i < sort.length; i++){
            for(int j = i; j > 0; j--){
                if(sort[j] < sort[j-1]){
                    temp = sort[j];
                    sort[j] = sort[j-1];
                    sort[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sort));
    }

    public static void main(String[] args) {
        insertSort();
    }
}
