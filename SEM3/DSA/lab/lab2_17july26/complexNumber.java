import java.util.Scanner;

public class ComplexNumber {
    double real, imag;

    // Simple constructor
    ComplexNumber(double r, double i) {
        real = r;
        imag = i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real part of first number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first number: ");
        double i1 = sc.nextDouble();

        // Input second complex number
        System.out.print("Enter real part of second number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second number: ");
        double i2 = sc.nextDouble();

        // Create objects using constructor
        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        // Addition
        ComplexNumber add = new ComplexNumber(
            c1.real + c2.real,
            c1.imag + c2.imag
        );

        // Subtraction
        ComplexNumber sub = new ComplexNumber(
            c1.real - c2.real,
            c1.imag - c2.imag
        );

        // Multiplication
        ComplexNumber mul = new ComplexNumber(
            (c1.real * c2.real) - (c1.imag * c2.imag),
            (c1.real * c2.imag) + (c1.imag * c2.real)
        );

        // Output
        System.out.println("First Number = " + c1.real + " + " + c1.imag + "i");
        System.out.println("Second Number = " + c2.real + " + " + c2.imag + "i");

        System.out.println("Addition = " + add.real + " + " + add.imag + "i");
        System.out.println("Subtraction = " + sub.real + " + " + sub.imag + "i");
        System.out.println("Multiplication = " + mul.real + " + " + mul.imag + "i");
    }
}
