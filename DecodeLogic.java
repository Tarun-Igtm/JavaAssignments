import java.util.Scanner;

public class DecodeLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int product = a * b;

        if (product > 500) {
            int sum = a + b;
            System.out.println("Product is greater than 500. Sum is: " + sum);
        } else {
            System.out.println("Hello LNB code is running fine !!");
        }

        sc.close();
    }
}
