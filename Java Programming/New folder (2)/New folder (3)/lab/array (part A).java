import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;

    public void insert(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
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
            students[i] = new Student();
            System.out.print("Enter name of student " + (i+1) + ": ");
            String name = sc.next();
            System.out.print("Enter ID of student " + (i+1) + ": ");
            int id = sc.nextInt();
            System.out.print("Enter CGPA of student " + (i+1) + ": ");
            double cgpa = sc.nextDouble();
            students[i].insert(name, id, cgpa);
        }

        System.out.println("\nList of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ":");
            students[i].display();
        }

        System.out.print("\nEnter the name or ID of the student to search: ");
        String searchKey = sc.next();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (students[i].name.equals(searchKey) || students[i].id == Integer.parseInt(searchKey)) {
                System.out.println("Student found:");
                students[i].display();
                found = true;
                System.out.print("Do you want to edit or delete this student's information? (y/n) ");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.print("Enter the new name of the student: ");
                    String newName = sc.next();
                    System.out.print("Enter the new ID of the student: ");
                    int newID = sc.nextInt();
                    System.out.print("Enter the new CGPA of the student: ");
                    double newCGPA = sc.nextDouble();
                    students[i].insert(newName, newID, newCGPA);
                    System.out.println("Student information updated.");
                }
                else {
                    System.out.println("No changes made.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
