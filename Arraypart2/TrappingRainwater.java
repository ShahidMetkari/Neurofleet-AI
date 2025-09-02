package Arraypart2;

public class TrappingRainwater {

    public static int trappedRainwater(int height[]) { // O(n)
        // (water level - bar level)*width = trapped water.
        int n = height.length;
        // calculate left max booundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        System.out.println("leftmax array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + leftMax[i]);
        }
        System.out.println(" ");
        // calculate right max booundary - array
        int rightMax[] = new int[n];
        // rightMax[n - 1] = height[n - 1];
        // for (int i = n - 2; i >= 0; i--) {
        //     rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        // }
        
        System.out.println("rightMax Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + rightMax[i]);
        }
        System.out.println(" ");

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // water level = min(maxleft boundary , maxright boundary)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }
}
