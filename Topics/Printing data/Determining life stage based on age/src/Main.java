import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the integer
        int age = scanner.nextInt();

        if (age < 13){
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        }else if ( age < 100){
            System.out.println("Senior Citizen");
        }else {
            System.out.println("0-100");
        }

    }
}