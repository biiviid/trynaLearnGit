package week1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class day2blablabla {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        while (true) {
            System.out.println("task selector: ");
            System.out.println("[1] Declare at least one variable of every primitive type — give them values that make sense for what they represent");
            System.out.println("[2] Write a program that takes two integers and prints their sum, difference, product, and division result — pay attention to what happens with integer division");
            System.out.println("[3] Try assigning a `double` to an `int` without casting. Read the error. Then fix it");
            System.out.println("[4] Explore what happens when you concatenate different types with a `String` using `+`");
            System.out.println("[5] You have a price of `19.99` and a quantity of `3`. Calculate the total, then calculate what the total would be after a `12%` tax. Print both values. Now think — which data type is \"safest\" for money, and why might `double` cause problems in real banking software?");
            System.out.println("[6] Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> case1();
                case 2 -> case2();
                case 3 -> case3();
                case 4 -> case4();
                case 5 -> case5();
                case 6 -> System.exit(0);
            }
        }

    }

    static void case1() {
        int intint = 5;
        boolean waaahiyaah = false;
        byte aaa = 3;
        float burgers = 9.99f;
        double smhex = 3.14129;
        char theLetterA = 'a';

        System.out.println(intint + "\n" + waaahiyaah  + "\n" + aaa  + "\n" + burgers + "\n" + smhex + "\n" + theLetterA);
    }

    static void case2() {
        System.out.print("Enter an integer: ");
        int integer1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter ANOTHER integer: ");
        int integer2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Incredible results right here fam");
        System.out.println("sum: " + (integer1 + integer2) + "\ndifference: " + (integer1 - integer2) + "\nproduct: " + (integer1 * integer2) + "\nquotient: " + (integer1 / integer2));
    }

    static void case3() {
        double a = 3546.34564363;
        double b = 232552.324623525;
        double hello = (int) (a + b);
        System.out.println(hello);
    }

    static void case4() {
        /*here are all the data types that i remember
        String
        int
        float
        double
        boolean
        byte
         */

        //claude told me about short and long
        //soo it's byte - short - int - long - float - double - BigDecimal (looking this up also showed me BigInteger which is basically as much as your memory)
        //do you feel long

        String name = "Jerson";
        int num = 83;
        short smallNum = 24324;
        long bigNum = 2424225L;
        float moreNums = 243.45f;
        double evemMoreNums = 234.6436435;
        boolean doesHeKnow = false;
        byte singleNum = 4;

        System.out.println(name + num);
        System.out.println(name + moreNums);
        System.out.println(name + doesHeKnow + singleNum);
        System.out.println(evemMoreNums + singleNum + name + doesHeKnow);
        System.out.println(evemMoreNums + singleNum + name + doesHeKnow + num);
        System.out.println(evemMoreNums + singleNum + name + doesHeKnow + num + num);
        System.out.println(evemMoreNums + singleNum + name + doesHeKnow + num + num + bigNum);
        System.out.println(evemMoreNums + singleNum + name + doesHeKnow + num + num + smallNum );


    }

    static void case5() {
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("3");
        BigDecimal tax = new BigDecimal("0.12");
        BigDecimal total = price.multiply(quantity).setScale(2, RoundingMode.HALF_UP);
        System.out.println(total);
        BigDecimal totalAfterTax = total.add(total.multiply(tax).setScale(2, RoundingMode.HALF_UP));
        System.out.println(totalAfterTax);

        //looking this up made me learn BigDecimal does not auto widen
        /* i now just learned that any decimal types without an f is auto converted to double. this may be problematic since it is WAY too long

         */
    }
}
