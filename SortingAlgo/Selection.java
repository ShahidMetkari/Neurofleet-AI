public class Selection {

    public static void selection(int arr[]) {
        System.out.println("length of array:" + arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // pick the smallest and put them at the beginning (idea of selection sort)
        int arr[] = { 4,1,3,9,7 };
        selection(arr);
        printArr(arr);
    }
}
