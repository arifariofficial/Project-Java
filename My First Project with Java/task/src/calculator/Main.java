package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int income = 5405;
        System.out.println("""
                Earned amount:
                Bubblegum: $202
                Toffee: $118
                Ice cream: $2250
                Milk chocolate: $1680
                Doughnut: $1075
                Pancake: $80
                                
                Income: $5405.0""");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        System.out.println("Net income: $" + (income - (staffExpenses + otherExpenses)));
    }
}