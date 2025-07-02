import java.util.ArrayList;

public class LNBdynamicarray {
    public static void main(String[] args) {
        // Original arrays
        int[] L1 = {11, 21, 24, 12, 18};
        int[] L2 = {14, 44, 25, 37, 13};

        ArrayList<Integer> L3 = new ArrayList<>();

        // From L1 → take odd index items
        for (int i = 0; i < L1.length; i++) {
            if (i % 2 != 0) {
                L3.add(L1[i]);
            }
        }

        // From L2 → take even index items
        for (int i = 0; i < L2.length; i++) {
            if (i % 2 == 0) {
                L3.add(L2[i]);
            }
        }

        // Print final L3
        System.out.print("L3 = [");
        for (int i = 0; i < L3.size(); i++) {
            System.out.print(L3.get(i));
            if (i != L3.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
