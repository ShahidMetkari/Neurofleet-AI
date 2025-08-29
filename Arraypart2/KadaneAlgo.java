package Arraypart2;

public class KadaneAlgo {
    /**
     * @param arr
     */
    public static void maxsubarr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[i - 1];
                // for (int k = start; k <= end; k++) {
                // currSum = currSum + arr[k];
                // }
                System.out.println("sum is: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("Max sum: " + maxSum);
    }

    public static void kadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("our max subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        kadane(arr);
    }
}
