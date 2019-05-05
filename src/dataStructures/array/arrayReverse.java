package dataStructures.array;

import java.util.Arrays;

public class arrayReverse {

    private static void reverseArray(){
        int [] orig = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = orig.length;
        int [] rev = new int [n];
        for(int i=0; i < orig.length; i++){
            rev[n-1] = orig[i];
            n--;
        }
        System.out.println(Arrays.toString(orig));
        System.out.println(Arrays.toString(rev));
    }

    public static void main(String[] args) {
        reverseArray();
    }
}
