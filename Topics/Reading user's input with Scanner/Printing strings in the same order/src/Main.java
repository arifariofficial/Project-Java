import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // Assuming each word is entered on new line
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();

        // Output the words in the same order
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
    }
}