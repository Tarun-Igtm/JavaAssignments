public class LNBdynamicarray {

    // Function to calculate sum of elements in a tuple
    public static int findSum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    // Function to compare and swap
    public static void sortTuples(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                boolean shouldSwap = false;

                // Compare by length
                if (arr[i].length > arr[j].length) {
                    shouldSwap = true;
                }
                // If length same, compare by sum
                else if (arr[i].length == arr[j].length) {
                    int sum1 = findSum(arr[i]);
                    int sum2 = findSum(arr[j]);

                    if (sum1 > sum2) {
                        shouldSwap = true;
                    }
                    // If sum same, compare by first element
                    else if (sum1 == sum2 && arr[i][0] > arr[j][0]) {
                        shouldSwap = true;
                    }
                }

                // Swap logic
                if (shouldSwap) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Tuples as 2D array
        int[][] tuples = {
            {2, 1, 2},
            {2, 5},
            {4, 5, 3, 7},
            {3, 1},
            {1, 6}
        };

        sortTuples(tuples); // Sorting the tuples

        // Print output
        System.out.print("Sorted Tuples: [");
        for (int i = 0; i < tuples.length; i++) {
            System.out.print("(");
            for (int j = 0; j < tuples[i].length; j++) {
                System.out.print(tuples[i][j]);
                if (j < tuples[i].length - 1) System.out.print(",");
            }
            System.out.print(")");
            if (i < tuples.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
