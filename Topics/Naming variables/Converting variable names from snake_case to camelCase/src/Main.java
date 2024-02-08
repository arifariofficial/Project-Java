import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Take string input using Scanner object
        String snakeCaseString = scan.nextLine();
        // You can initialize an empty string for storing the camelCase result
        String camelCaseString = "";

        // TODO: Write a loop through each character in the snakeCaseString
        // If the character is '_', skip to the next iteration and convert the next character to upper case
        // Else, just add the character to camelCaseString

        // After the loop, print the camelCaseString
        System.out.println(camelCaseString);
    }
}