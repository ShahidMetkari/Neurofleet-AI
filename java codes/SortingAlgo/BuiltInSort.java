import java.util.Arrays;
import java.util.Collections;

public class BuiltInSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr); // O(n logn)
        // Arrays.sort(arr, 0, 3);
        // to reverse the array , import the collections library first.
        // import java.util.Collections;
        // Arrays.sort(arr,Collections.reverseOrder());
        // jar int type madhe array declare kela asel tr sort chya khali red line yennar , pn jr Integer madhe kela tr nahi yenar.
        // karan reverse order function na fakt objectss vr kaaam karto, aani int typecha array ha primitive zala. 
        printArr(arr);
    }
}
