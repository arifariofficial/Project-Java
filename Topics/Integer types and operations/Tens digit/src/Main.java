import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int N = scanner.nextInt();

        // Removing the last digit to shift the digits to the right
        int shifted = N / 10;
        //System.out.println(shifted);

        // Finding the tens digit by getting the remainder of division by 10
        int tensDigit = shifted % 10;
        System.out.println(tensDigit);
    }
}