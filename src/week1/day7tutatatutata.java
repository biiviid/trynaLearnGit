package week1;
import java.util.*;

//according to the instructions, i need a student object i assume, where that student has a String name and an int grade
//i'll need these things
//add a student
//remove a student
//list all students
//get average grade of all students, showing the highest and lowest grades
//input a grade, and it shows all students with grades below it AND their grade, descending, sorting done by me
//this will be my first time not making anew file for a new class

class Student{
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}

public class day7tutatatutata {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> studentArrayList = new ArrayList<>();
    static void main() {
        while (true) {
            System.out.println("STUDENT GRADE MANAGER");
            System.out.println("1. Add a student (name + numeric grade)\n" +
                    "2. Remove a student by name\n" +
                    "3. List all students\n" +
                    "4. Calculate and display the class average and Find the highest and lowest grade\n" +
                    "5. Get descending list of students with their grades from one integer input\n" +
                    "6. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
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
        System.out.print("Enter the new student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new student's current grade: ");
        int grade = Integer.parseInt(scanner.nextLine());
        studentArrayList.add(new Student(name, grade));

        System.out.println("Added!");
    }

    static void two() {
        System.out.print("Enter the name of the Student you want to delete: ");
        String studentToDelete = scanner.nextLine();
        for (int i = studentArrayList.size() -1; i >= 0 ; i--) {
            Student student = studentArrayList.get(i);
            if (student.getName().equals(studentToDelete)) {
                studentArrayList.remove(i);
            }
        }
    }

    static void three() {
        System.out.println("All Students at this school: ");
        if (studentArrayList.isEmpty()) {
            System.out.println("empty list");
        } else {
            for (Student student : studentArrayList) {
                System.out.println(student.getName());
            }
        }
    }

    static void four() {
        if (studentArrayList.isEmpty()) {
            System.out.println("empty list");
        } else {
            System.out.println("Highest and Lowest grades at the school: ");
            float lowestGrade = Integer.MAX_VALUE;
            float highestGrade = Integer.MIN_VALUE;
            float total = 0;
            for (Student student : studentArrayList) {
                int grade = student.getGrade();
                if (grade < lowestGrade) {
                    lowestGrade = grade;
                } else if (grade > highestGrade) {
                    highestGrade = grade;
                }
                total = total + grade;
            }
            float clasAve = total / studentArrayList.size();
            System.out.println("Highest Grade: " + highestGrade);
            System.out.println("Lowest Grade: " + lowestGrade);
            System.out.println("Class Average: " + clasAve);
        }
    }

    static void five() {
        System.out.print("Enter a grade: ");
        int gradeThreshold = Integer.parseInt(scanner.nextLine());

        ArrayList<Student> studentsBelowThreshold = new ArrayList<>();

        for (Student student : studentArrayList) {
            if (student.getGrade() <= gradeThreshold) {
                studentsBelowThreshold.add(student);
            }
        }

        for (int i = 0; i < studentsBelowThreshold.size() - 1; i++) {
            for (int j = 0; j < studentsBelowThreshold.size() - i - 1; j++) {
                Student stud1 = studentsBelowThreshold.get(j);
                Student stud2 = studentsBelowThreshold.get(j + 1);
                if (stud1.getGrade() < stud2.getGrade()) {
                    //i dont need temp here since the two students outside this loop already acts as temps
                    studentsBelowThreshold.set(j, stud2);
                    studentsBelowThreshold.set(j + 1, stud1);
                }
            }
        }

        System.out.println("All Students who fall below the threshold and their respective grades: ");
        for (Student student : studentsBelowThreshold) {
            System.out.println(student.name + " " + student.getGrade());
        }
    }
}
