package week1;
import java.util.*;


public class day4aahiyah {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        while (true) {
            System.out.println("TASKS MENU");
            System.out.println("1. Print a right-angle triangle of stars where the row count is a variable you control\n" +
                    "2. Print a full multiplication table (1–10) using nested loops\n" +
                    "3. Write a loop that sums all numbers from 1 to 100 — verify against Gauss's formula\n" +
                    "4. Use `continue` to skip even numbers when printing 1–20\n" +
                    "5. Rewrite one of your `for` loops as a `while` loop — notice what you now have to manage manually\n" +
                    "6. Challenge");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> one();
                case 2 -> two();
                case 3 -> three();
                case 4 -> four();
                case 5 -> five();
                case 6 -> six();
                case 7 -> System.exit(0);
            }
        }
    }

    static void one() {
        System.out.print("Enter your desired row count: ");
        int rowCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void two() {
        int currentNum = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(currentNum + " x " + j + "=" +(currentNum * j));
            }
            currentNum ++;
        }
    }

    static void three() {
        int currentNum = 0;
        int nextNum = 1;
        int counts = 1;
        do {
            currentNum = currentNum + nextNum;
            nextNum =  counts + 1;
            counts++;
        } while (counts != 101);
        int total = currentNum;
        System.out.println("the total is " + total);
    }

    static void four() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    static void five() {
        int num = 0;
        while (num < 20) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }

    static void six() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                int num = 1;
                int total = num + j;
                System.out.print(total + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                int num = 1;
                int total = num + j;

                System.out.print(total + " ");
            }
            System.out.println();
        }
    }

}
