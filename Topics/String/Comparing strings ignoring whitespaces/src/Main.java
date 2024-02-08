import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // Read two lines of input
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        // Remove whitespaces from both lines
        String firstLineWithoutWhitespaces = firstLine.replace(" ", "");
        String secondLineWithoutWhitespaces = secondLine.replace(" ", "");

        System.out.println(firstLineWithoutWhitespaces.equals(secondLineWithoutWhitespaces));



    }
}