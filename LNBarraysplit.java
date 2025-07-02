import java.util.ArrayList;

public class LNBarray {
    public static void main(String[] args) {

        // Step 1: Create dynamic array 1 to 20
        ArrayList<Integer> originalList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            originalList.add(i);
        }

        // Step 2: Create new array with first 5 and last 5 elements
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            newList.add(originalList.get(i));               // first 5
        }
        for (int i = 15; i < 20; i++) {
            newList.add(originalList.get(i));               // last 5
        }

        System.out.println("New List (First 5 + Last 5): " + newList);

        // Step 3: Create array of squares
        ArrayList<Integer> squareList = new ArrayList<>();
        for (int num : newList) {
            squareList.add(num * num);
        }

        System.out.println("Squares of New List: " + squareList);

        // Step 4: Split newList into parts: 2, 3, 5
        ArrayList<Integer> part1 = new ArrayList<>(newList.subList(0, 2));
        ArrayList<Integer> part2 = new ArrayList<>(newList.subList(2, 5));
        ArrayList<Integer> part3 = new ArrayList<>(newList.subList(5, 10));

        System.out.println("Part 1 (2 items): " + part1);
        System.out.println("Part 2 (3 items): " + part2);
        System.out.println("Part 3 (5 items): " + part3);
    }
}
