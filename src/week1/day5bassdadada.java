package week1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day5bassdadada {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        while (true) {
            System.out.println("DAY 5 TASKS");
            System.out.println("1. Create an array of 5 student names. Print them. Try to add a 6th — what happens?\n" +
                    "2. Do the same with `ArrayList<String>`. Add, remove, and update entries freely\n" +
                    "3. Write a method that takes `int[]` and returns the largest value — no built-in sort or max allowed\n" +
                    "4. Convert your array to an ArrayList and back — look up how, then think about why you'd ever need to\n" +
                    "5. Challenge\n" +
                    "6. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice)  {
                case 1 -> one();
                case 2 -> two();
                case 3 -> three();
                case 4 -> four();
                case 5 -> five();
                case 6 -> System.exit(0);
            }
        }
    }

    static void one() {
        String[] names = {"John", "James", "Johnathan", "Johanne", "That one red angry bird that goes 'AAAAAAHIYAH'"};
        for (String s : names) {
            System.out.println(s);
        }

        names[6] = "bellow";

        //index will be out of bounds

    }

    static void two() {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ben", "Ben Again", "Benjamin", "Ben and ben", "Ben from Tom and Friends"));
        names.add("bond");

        for (String s : names) {
            System.out.println(s);
        }

        //it works because it is very dynamic unlike the evil array
    }

    static void three() {
        System.out.print("Enter the length of the array you want: ");
        int arrLength = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter the number for index number "  + i + ": ");
            int num = Integer.parseInt(scanner.nextLine());
            nums[i] = num;
        }


        System.out.println("Your entries: ");
        for (int s : nums) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                int temp;
                if (nums[j] > nums[j + 1]) {
                    temp =  nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        //im surprised i winged bubble sort

        System.out.println("\nYour entries, arranged: ");
        for (int s : nums) {
            System.out.print(s + " ");
        }

        System.out.println("\nNow the biggest number: ");
        int biggestNum = 0;
        for (int num : nums) {
            if (num > biggestNum) {
                biggestNum = num;
            }
        }
        System.out.println(biggestNum);



    }

    static void four() {
        String[] names = {"John", "bob", "bebajbafbaf", "ofuihgyahfgr", "iuyuyqwfhq"};


        System.out.println("Array mode: ");
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println();

        ArrayList<String> nameser = new ArrayList<>(Arrays.asList(names));

        System.out.println("ArrayList Mode: ");
        for (String s : nameser) {
            System.out.println(s);
        }

        String[] namesAgain = nameser.toArray(String[]::new);
        System.out.println();
        System.out.println("Back to Arrays: ");
        for (String s : namesAgain) {
            System.out.println(s);
        }
    }

    static void five() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,4,5,5));
        //first i need to remove all dupes
        //oh man i forgot how to use an iterator
        //or maybe i just use collecttions.remnove which i have only heard about but seems awesome
        //hmmmm maybe i should do this backwards

        for (int i = 0; i < nums.size(); i++) {
            for (int j = nums.size() - 1; j >= 0; j--) {
                if ((nums.get(i) == nums.get(j)) && i !=j) {
                    nums.remove(j);
                }
            }
        }

        System.out.println(nums);
        System.out.println("now in reverse: ");

        for (int i = nums.size() - 1; i >=0  ; i--) {
            System.out.print(nums.get(i) + " ");
        }

        System.out.println("Now to add them all\n");

        int total = 0;

        for (int num : nums) {
            total = total + num;
        }

        System.out.println(total);

    }
}
