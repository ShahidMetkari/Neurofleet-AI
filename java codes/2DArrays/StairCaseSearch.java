public class StairCaseSearch {

    public static boolean staircaseSearch(int matrix[][], int key) { // O(n+m)
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        // notes:- ek sorted array dilela asel, tya madhe jr ek element udkaych asel tr
        // kahi rules aahet
        // 1. start karaych corners ne

        // 2. mg conditions check karayche

        // 3. conditions are- jr aapan top right ne start kela, tr key< cell value asel
        // tr go to left and key > cell value asel tr go to bottom
        // ya mdhe I moves from 0 to n-1 and j moves from m-1 to 0

        // 4. jr aapan bottom left ne start kela tr, key < cell value tr top la move
        // karaych aani key > cell value asel tr right la move karaych
        // this is staircase search.

        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        staircaseSearch(matrix, key);
    }
}
