import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        // Reading the number of students in each of the three groups
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        // Calculating the number the desk needed for each group
        int deskGroup1 = (group1 / 2) + (group1 % 2);
        int deskGroup2 = (group2 / 2) + (group2 % 2);
        int deskGroup3 = (group3 / 2) + (group3 % 2);

        int totalDesk = deskGroup1 + deskGroup2 + deskGroup3;
        System.out.println(totalDesk);

    }
}