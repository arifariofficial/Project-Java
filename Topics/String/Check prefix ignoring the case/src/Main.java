import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // Read the string
        String inputString = scanner.nextLine();

        boolean startsWithJ = inputString.toLowerCase().startsWith("j");
        System.out.println(startsWithJ);
    }
}