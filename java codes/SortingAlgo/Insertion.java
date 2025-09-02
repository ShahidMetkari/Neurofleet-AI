public class Insertion {

    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; //temp stored 
            int prev = i - 1;
            //finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // idea - pick an element(from unsorted part)& place in the right pos in sorted
        // part
        int arr[] = { 5, 4, 1, 3, 2 };
        insertion(arr);
        printArr(arr);
    }
}
