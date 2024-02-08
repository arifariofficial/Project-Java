import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int k = scanner.nextInt();
        System.out.println();
        int n = scanner.nextInt();

        System.out.println(n % k);

        scanner.close();

    }
}