import java.util.*;

public class Practical_05 {

    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Employee> employees = new ArrayList<>();

    public static Address readAddress() {
        System.out.print("Street Number: ");
        int num = sc.nextInt(); sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();

        System.out.print("State: ");
        String state = sc.nextLine();

        System.out.print("Country: ");
        String country = sc.nextLine();

        return new Address(num, city, state, country);
    }

    public static void addStudent() {
        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Student USN: ");
        String usn = sc.nextLine();

        Address addr = readAddress();
        students.add(new Student(usn, name, addr));
    }

    public static void addEmployee() {
        System.out.print("Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Employee UPID: ");
        String upid = sc.nextLine();

        Address addr = readAddress();
        employees.add(new Employee(upid, name, addr));
    }

    public static void showStudents() {
        for (Student s : students) System.out.println(s);
    }

    public static void showEmployees() {
        for (Employee e : employees) System.out.println(e);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Student 2.Employee 3.Show Students 4.Show Employees 5.Exit");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addEmployee();
                case 3 -> showStudents();
                case 4 -> showEmployees();
                case 5 -> { return; }
            }
        }
    }
}

class Address {
    int num;
    String city, state, country;

    Address(int num, String city, String state, String country) {
        this.num = num;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString() {
        return num + ", " + city + ", " + state + ", " + country;
    }
}

class Student {
    String usn, name;
    Address address;

    Student(String usn, String name, Address address) {
        this.usn = usn;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Student: " + name + " (" + usn + ") - " + address;
    }
}

class Employee {
    String upid, name;
    Address address;

    Employee(String upid, String name, Address address) {
        this.upid = upid;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Employee: " + name + " (" + upid + ") - " + address;
    }
}