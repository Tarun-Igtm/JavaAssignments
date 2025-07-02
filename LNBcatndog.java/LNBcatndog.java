import java.util.Scanner;

public class LNBcatndog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the string: ");
        String input = sc.nextLine().toLowerCase(); // case-insensitive

        int catCount = 0;
        int dogCount = 0;

        // Traverse string and count "cat" and "dog"
        for (int i = 0; i <= input.length() - 3; i++) {
            String sub = input.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            } else if (sub.equals("dog")) {
                dogCount++;
            }
        }

        System.out.println("Cat count: " + catCount);
        System.out.println("Dog count: " + dogCount);

        // Check condition
        if (catCount == dogCount) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

        sc.close();
    }
}
