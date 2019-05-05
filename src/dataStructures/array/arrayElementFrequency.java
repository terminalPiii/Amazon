package dataStructures.array;

public class arrayElementFrequency {
    private void frequency(int[] arr, int n){
        // subtract 1 from every element so that the elements become in range 0 to n-1
        for(int j=0; j < n; j++)
            arr[j] = arr[j]-1;
        //use every element arr[i] as index and add 'n' to element present at arr[i]%n
        //to keep track of count of occurrences of arr[i]
        for(int i =0; i < n; i++)
            arr[arr[i] % n] = arr[arr[i] % n] + n;
        //to print counts, simply print the number of times n was added at index
        //corresponding to every element
        for(int i =0; i < n; i++)
            System.out.println(i + 1 + "->" + arr[i] /n);
    }

    void findCounts(int[] arr, int n)
    {
        // Traverse all array elements
        int i = 0;
        while (i < n)
        {
            // If this element is already processed,
            // then nothing to do
            if (arr[i] <= 0)
            {
                i++;
                continue;
            }

            // Find index corresponding to this element
            // For example, index for 5 is 4
            int elementIndex = arr[i] - 1;

            // If the elementIndex has an element that is not
            // processed yet, then first store that element
            // to arr[i] so that we don't loose anything.
            if (arr[elementIndex] > 0)
            {
                arr[i] = arr[elementIndex];

                // After storing arr[elementIndex], change it
                // to store initial count of 'arr[i]'
                arr[elementIndex] = -1;
            }
            else
            {
                // If this is NOT first occurrence of arr[i],
                // then decrement its count.
                arr[elementIndex]--;

                // And initialize arr[i] as 0 means the element
                // 'i+1' is not seen so far
                arr[i] = 0;
                i++;
            }
        }

        System.out.println("Below are counts of all elements");
        for (int j = 0; j < n; j++)
            System.out.println(j+1 + "->" + Math.abs(arr[j]));
    }

    public static void main (String[] args){
        arrayElementFrequency count = new arrayElementFrequency();
        int[] arr = {1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1};
        int[] arr1 = {1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 15};
        int n = arr.length;
        int nn = arr1.length;
        count.frequency(arr,n);
        count.findCounts(arr1, nn);
    }
}
