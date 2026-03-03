

public class Practical_04 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(7, 7);

        System.out.println("Complex-1: " + c1);
        System.out.println("Complex-2: " + c2);
        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.subtract(c2));
    }
}

class Complex {

    private final int real;
    private final int imaginary;

    // Constructor
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getters
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    // Addition
    public Complex add(Complex other) {
        return new Complex(
            this.real + other.real,
            this.imaginary + other.imaginary
        );
    }

    // Subtraction
    public Complex subtract(Complex other) {
        return new Complex(
            this.real - other.real,
            this.imaginary - other.imaginary
        );
    }

    // Override toString
    @Override
    public String toString() {
        return String.format("%d + %di", real, imaginary);
    }

    
}