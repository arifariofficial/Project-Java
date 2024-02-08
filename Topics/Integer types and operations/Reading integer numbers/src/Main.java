import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        //Reading the entire line as a single string
        String line = scanner.nextLine();

        //Splitting the line into separate strings based on one or more spaces
        String[] numbers = line.split("\\s+");

        //Printing each number on a new line
        for (String number : numbers) {
            System.out.println(number);
        }
        scanner.close();
    }
}