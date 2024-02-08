import java.util.Scanner; // Now you can use Scanner class here to get the user input.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner object to take the input data
        int num = scanner.nextInt();
        System.out.println(num * 2);

        scanner.close();  // After using scanner, remember to close it!
    }
}