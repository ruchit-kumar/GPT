import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int rollNo;
    private String name;
    private int marks;

    Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student rollNo: " + rollNo);
        System.out.println("Student marks: " + marks);

    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter rollNo: ");
                    int rollNo = sc.nextInt();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine(); // consume newline

                    Student s1 = new Student(name, rollNo, marks);
                    students.add(s1);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
