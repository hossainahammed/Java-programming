import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public Student() {
        this.name = "";
        this.id = 0;
        this.cgpa = 0.0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            String name = sc.next();
            System.out.print("Enter ID of student " + (i+1) + ": ");
            int id = sc.nextInt();
            System.out.print("Enter CGPA of student " + (i+1) + ": ");
            double cgpa = sc.nextDouble();
            students[i] = new Student(name, id, cgpa);
        }

        System.out.println("\nList of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ":");
            students[i].display();
        }

        sc.close();
    }
}
