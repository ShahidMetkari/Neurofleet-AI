package Arrayspart1;

import java.util.*;

public class LargestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        // return largest;
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 69, 21 };
        // System.out.println("Largest number is: " + getLargest(numbers));
        System.out.println("smallest number is: " + getLargest(numbers));

    }
}
