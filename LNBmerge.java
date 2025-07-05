import java.util.Scanner;
import java.util.HashMap;

public class LNBmerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of both arrays (same size): ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] keys = new String[size];
        String[] values = new String[size];

        System.out.println("Enter unique keys (can be number or name):");
        for (int i = 0; i < size; i++) {
            System.out.print("Key " + (i+1) + ": ");
            keys[i] = sc.nextLine();
        }

        System.out.println("Enter corresponding values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Value " + (i+1) + ": ");
            values[i] = sc.nextLine();
        }

        // Merge into a Map
        HashMap<String, String> mergedMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            mergedMap.put(keys[i], values[i]);
        }

        // Display the Map
        System.out.println("\nMerged Map:");
        System.out.println(mergedMap);
    }
}
