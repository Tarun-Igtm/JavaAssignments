import java.util.Scanner;

public class LNBstring_dynamicarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence or paragraph:");
        String input = sc.nextLine();  // full paragraph input

        String[] words = input.split(" "); // split by space
        String[] result = new String[words.length]; // temp array
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String word = clean(words[i]);
            if (word.length() > 4) {
                result[count] = word;
                count++;
            }
        }

        // Print the dynamic array
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i]);
            if (i < count - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    // Function to remove punctuation from word
    public static String clean(String word) {
        String cleaned = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                cleaned += ch;
        }
        return cleaned;
    }
}
