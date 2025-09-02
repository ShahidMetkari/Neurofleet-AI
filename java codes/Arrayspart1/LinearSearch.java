package Arrayspart1;

public class LinearSearch {

    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        System.out.println("Key is at index: "+linearsearch(numbers, key));
    }
}
