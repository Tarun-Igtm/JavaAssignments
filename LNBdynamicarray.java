public class LNBdynamicarray {

    // Function to calculate sum of elements in a tuple
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Function to sort the tuples based on logic
    public static void sortTuples(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                boolean swap = false;

                // Compare by length
                if (arr[i].length > arr[j].length) {
                    swap = true;
                }
                // If length same, compare by sum
                else if (arr[i].length == arr[j].length) {
                    int sum1 = getSum(arr[i]);
                    int sum2 = getSum(arr[j]);

                    if (sum1 > sum2) {
                        swap = true;
                    }
                    // If sum same, compare by first element
                    else if (sum1 == sum2 && arr[i][0] > arr[j][0]) {
                        swap = true;
                    }
                }

                // Swap arrays if needed
                if (swap) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int[][] tuples = {
            {2,1,2},
            {2,5},
            {4,5,3,7},
            {3,1},
            {1,6}
        };

        sortTuples(tuples); // Sort the tuples

        // Print sorted tuples
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
