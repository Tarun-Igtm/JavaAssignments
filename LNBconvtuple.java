import java.util.Scanner;

public class LNBconvtuple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Tuple input as comma-separated string
        System.out.print("Enter numbers in tuple format (e.g., 21,37,18): ");
        String tupleInput = sc.nextLine();

        // Step 2: Enter string to be inserted
        System.out.print("Enter string to insert (e.g., Age): ");
        String insertStr = sc.nextLine();

        // Step 3: Split and convert to dynamic array
        String[] numbers = tupleInput.split(",");
        String[] resultArray = new String[numbers.length * 2];

        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            resultArray[j++] = numbers[i].trim();
            resultArray[j++] = insertStr;
        }

        // Step 4: Print final result as tuple
        System.out.print("Result tuple: (");
        for (int i = 0; i < resultArray.length; i++) {
            if (i > 0) System.out.print(", ");
            if (i % 2 == 0)
                System.out.print(resultArray[i]);
            else
                System.out.print("\"" + resultArray[i] + "\"");
        }
        System.out.println(")");
    }
}
