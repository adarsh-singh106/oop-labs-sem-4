import java.util.Scanner;

class Shape {
    int x;
    int y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Shape(int x) {
        this.x = x;
    }

    public double PrintArea() {
        return this.x * this.y;
    }
}

class Rectangle extends Shape {

    Rectangle(int h, int b) {
        super(h, b);

    }
}

class Triangle extends Shape {

    Triangle(int h, int b) {
        super(h, b);

    }

    public double PrintArea() {
        return 0.5 * this.x * this.y;
    }
}

class Circle extends Shape {
    double pi = 3.14;

    Circle(int r) {
        super(r);

    }

    public double PrintArea() {
        return pi * this.x * this.x;
    }
}

public class Practical_07 {
    public static void main(String[] args) {
        System.out.println("<---- Program Starts Here ---->");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Shape class ! Choose a Shape to Cal its Area");
            System.out.println("1. Reactangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("User Choice : ");
            int Choice = sc.nextInt();
            if (Choice == 1) {
                System.out.println("Lets Calculate Area of Reactange : ");
                System.out.print("Length of Reactange : ");
                int length = sc.nextInt();
                System.out.print("Breadth of Reactange : ");
                int breadth = sc.nextInt();
                Rectangle r1 = new Rectangle(length, breadth);
                System.out.println("Area of Reactange :" + r1.PrintArea());
            } else if (Choice == 2) {
                System.out.println("Lets Calculate Area of Triangle : ");
                System.out.print("Height of Triangle : ");
                int Height = sc.nextInt();
                System.out.print("base of Triangle : ");
                int base = sc.nextInt();
                Triangle r1 = new Triangle(Height, base);
                System.out.println("Area of Triangle :" + r1.PrintArea());

            } else if (Choice == 3) {
                System.out.println("Lets Calculate Area of Circle : ");
                System.out.print("Radius of Circle : ");
                int r = sc.nextInt();

                Circle r1 = new Circle(r);
                System.out.println("Area of Circle :" + r1.PrintArea());
            } else if (Choice == 4) {
                System.out.println("Bye");
                sc.close();
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}
