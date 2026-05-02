package week1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class day3blablabla {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        while (true) {
            System.out.println("DAY 3");
            System.out.println("[1] Build a grade calculator: take a numeric score and print the letter grade — use `if/else if` first, then rewrite with `switch`");
            System.out.println("[2] Write a program that checks if a number is positive/negative/zero AND even/odd — combine both checks into one readable output line");
            System.out.println("[3] Rewrite one of your `if/else` conditions as a ternary — does it read better or worse?");
            System.out.println("[4] Challenge");
            System.out.println("[5] Exit");

            System.out.print("Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> one();
                case 2 -> two();
                case 3 -> three();
                case 4 -> four();
                case 5 -> System.exit(0);
            }
        }
    }

    static void one() {
        System.out.print("Enter a grade: ");
        int gradeNum = Integer.parseInt(scanner.nextLine());
        String grade = "x";

//        if (gradeNum >= 97) {
//            grade = "A+";
//        } else if (gradeNum >= 95) {
//            grade = "A";
//        } else if (gradeNum >= 92) {
//            grade = "A-";
//        } else if (gradeNum >= 87) {
//            grade = "B+";
//        } else if (gradeNum >= 85) {
//            grade = "B";
//        } else if (gradeNum >= 82) {
//            grade = "B-";
//        } else if (gradeNum >= 77) {
//            grade = "C+";
//        } else if (gradeNum >= 75) {
//            grade = "C";
//        } else if (gradeNum >= 72) {
//            grade = "C-";
//        } else if (gradeNum >= 67) {
//            grade = "D+";
//        } else if (gradeNum >= 65) {
//            grade = "D";
//        } else if (gradeNum >= 62) {
//            grade = "D-";
//        } else {
//            grade = "F";
//        }

        //HOLY MOLY U CAN USE TERNARY OPERATORS INSIDE SWITCH CASES TO WIDEN UR RANGE

        switch ((gradeNum >= 97) ? 10 : (gradeNum >= 95) ? 9 : (gradeNum >= 92) ? 8 : (gradeNum >= 87) ? 7 : (gradeNum >= 85) ? 6 : (gradeNum >= 82) ? 5 : (gradeNum >= 77) ? 4 : (gradeNum >= 75) ? 3 : (gradeNum >= 72) ? 2 : (gradeNum >= 67) ? 1 : (gradeNum >= 65) ? 0 :  (gradeNum >= 62) ? -1 : -2) {
            case 10 -> grade = "A+";
            case 9 -> grade = "A";
            case 8 -> grade = "A-";
            case 7 -> grade = "B+";
            case 6 -> grade = "B";
            case 5 -> grade = "B-";
            case 4 -> grade = "C+";
            case 3 -> grade = "C";
            case 2 -> grade = "C-";
            case 1 -> grade = "D+";
            case 0 -> grade = "D";
            case -1 -> grade = "D-";
            case -2 -> grade = "F";
        }

        System.out.println(grade);

        System.out.println("grade: " + grade);
    }

    static void two() {
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        String posNedZer = "zero";
        String evenOdd;

        if (num > 0) {
            posNedZer = "positive";
        } else if (num < 0) {
            posNedZer = "negative";
        }

        if ((num % 2 != 0)) {
            evenOdd = "odd";
        } else {
            evenOdd = "even";
        }

        System.out.println("The number you entered is " + posNedZer + " and is an " + evenOdd + " number");
    }

    static void three() {
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        String posNedZer = "0";
        String evenOdd = "even";

        if (num > 0) {
            posNedZer = "positive";
        } else if (num < 0) {
            posNedZer = "negative";
        }

        evenOdd = (num % 2 != 0 ? "odd" : "even");

        System.out.println("The number you entered is " + posNedZer + " and is an " + evenOdd + " number");

    }

    static void four() {
        System.out.println("Movie Ticket Receipt Printer");
        System.out.print("Is it a Tuesday?: (y/n)");
        String ans = scanner.nextLine();
        boolean tues = (ans.equalsIgnoreCase("y")); //soo this is auto true/false huh

        BigDecimal origPrice = new BigDecimal("180");
        BigDecimal childDiscount = new BigDecimal("0.25");
        BigDecimal seniorDiscount  = new BigDecimal("0.30");
        BigDecimal studentDiscount = new BigDecimal("0.20");


        System.out.print("Enter a discount mode: ");
        System.out.println("[1] Children (under 12): 25% off\n" +
                "[2] Seniors (60+): 30% off\n" +
                "[3] Students (with ID): 20% off\n" +
                "[4] Regular: no discount");
        int choice = Integer.parseInt(scanner.nextLine());

        BigDecimal total = new BigDecimal("0");

        switch (choice) {
            case 1 -> total = origPrice.subtract(origPrice.multiply(childDiscount).setScale(2, RoundingMode.HALF_UP));
            case 2 -> total = origPrice.subtract(origPrice.multiply(seniorDiscount).setScale(2, RoundingMode.HALF_UP));
            case 3 -> total = origPrice.subtract(origPrice.multiply(studentDiscount).setScale(2, RoundingMode.HALF_UP));
            case 4 -> total = origPrice;
        }

        if (tues) {
            total = total.subtract(BigDecimal.valueOf(20)); //WHAAAAT
        }

        System.out.println(total);

        System.out.println();
    }
}
