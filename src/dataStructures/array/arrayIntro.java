package dataStructures.array;

import java.util.Arrays;

public class arrayIntro {
    public static void main (String[] args){
        //Array: Creates an array with 5 elements.
        int[] array = new int [5];
        String[] array2 = new String [5];
        int[] array3 = {1, 2, 3, 4, 5};

        //Add elements to the array
        array[0] = 10;
        array2[0]= "awesome";
        //Printing a specific array element
        System.out.println(array[0]);
        System.out.println(array2[0]);

        //for loop to iterate over and print an array
        for(int i =0; i<array3.length; i++){
            System.out.println(array3[i]);
        }

        //sorting an array with built in libraries
        int[] test = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
    }
}
