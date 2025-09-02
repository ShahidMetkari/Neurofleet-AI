package Arraypart2;

public class MaxSubarraySum {
    public static void maxsubarr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + arr[k];
                    // System.out.print(arr[k] + " ");
                }
                // System.out.println();
                System.out.println("sum is: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // System.out.println();
            } 
            // System.out.println();
        }
        System.out.println(" ");
        System.out.println("Max sum: " + maxSum);
    }
 
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxsubarr(arr);
    }
}
