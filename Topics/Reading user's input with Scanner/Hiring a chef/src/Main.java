import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String name = scanner.nextLine();
        int experience = scanner.nextInt();
        String cuisine = scanner.next();

        scanner.close();

        System.out.println("The form for " + name +  " is completed. We will contact you if we need a chef " +
                "who cooks " + cuisine  + " dishes and has " + experience +" years of experience.\n");


    }
}