public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // 1. calculate mid
        int mid = si + (ei - si) / 2;

        Mergesort(arr, si, mid); // left part
        Mergesort(arr, mid + 1, ei); // right part
        merge(arr, mid, si, ei);
    }

    public static void merge(int arr[], int mid, int si, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        // System.out.println("value of k is:" + k);
        // left part madhe kahi elements rahile astil tr
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // System.out.println("value of k is:" + k);
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 9, 2, 5, 10 };
        Mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
