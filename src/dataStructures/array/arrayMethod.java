package dataStructures.array;

public class arrayMethod {

    //Passing an array to a method
    private static void min(int[] arr){
        int min = arr[0];
        for(int i =1; i < arr.length; i++){
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] a = {66, 19, 9, 12, 57};
        min(a);
    }
}
