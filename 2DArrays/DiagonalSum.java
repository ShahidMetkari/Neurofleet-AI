public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) { // O(n^2)
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) { // condition for primary diagonal, i.e.left to right
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) { // condition for 2nd diagonal, i.e.
        // right to left
        // // if sum of index is equals to length of matrix then add the elements
        // present on the indices
        // sum += matrix[i][j];
        // }

        // }
        // }

        for (int i = 0; i < matrix.length; i++) { // O(n)
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) {
                // i+j=n-1, from this equation, we have j=n-1-i;
                sum += matrix[i][matrix.length - 1 - i];
            }
            // this we have done to avoid taking middle element twice in the addition in odd
            // length matrix, i.e.3,5,7 et.

        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("sum is: " + diagonalSum(matrix));
    }

}
