import java.util.Scanner;

public class LNBstrindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = input.length();

        System.out.println("String length: " + length);

        System.out.print("Result: ");
        if (length > 7) {
            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    System.out.print(input.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (i % 2 != 0) {
                    System.out.print(input.charAt(i));
                }
            }
        }

        sc.close();
    }
}
