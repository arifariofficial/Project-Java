import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number = scanner.nextInt();

        //Extract the individual digits
        int hundred = number / 100;
        int ten = (number / 10) % 10;
        //System.out.println(ten);
        int one = number % 10;

        int reversedNumber = (one * 100) + (ten * 10) + hundred;
        System.out.println(reversedNumber);
    }
}