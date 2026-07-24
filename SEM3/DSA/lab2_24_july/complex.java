

import java.util.Scanner;

class Complex {
int real1;
int imag1;
int real2;
int imag2;

void input(){
Scanner s = new Scanner(System.in);
System.out.print("Enter real part of first expression: ");
real1 = s.nextInt();
System.out.print("Enter imaginary part of first expression: ");
imag1 = s.nextInt();
System.out.print("Enter real part of second expression: ");
real2 = s.nextInt();
System.out.print("Enter imaginary part of second expression: ");
imag2 = s.nextInt();
}

void sum(){
int real = real1 + real2;
int imag = imag1 + imag2;
if (imag < 0){
System.out.println("\nSum: " + real + " " + imag + "i");
} else{
System.out.println("\nSum: " + real + " + " + imag + "i");
}
}

void sub(){
int real = real1 - real2;
int imag = imag1 - imag2;
if (imag < 0){
System.out.println("\nDifference: " + real + " " + imag + "i");
} else{
System.out.println("\nDifference: " + real + " + " + imag + "i");
}
}

void mult(){
int real = (real1 * real2) - (imag1 * imag2);
int imag = (real1 * imag2) + (imag1 * real2);
if (imag < 0){
System.out.println("Product: " + real + " " + imag + "i");
} else{
System.out.println("Product: " + real + " + " + imag + "i");
}
}

void div(){
double denominator = (real2 * real2) + (imag2 * imag2);
if (denominator == 0) {
System.out.println("Quotient: Cannot divide by zero.");
return;
}
double real = ((real1 * real2) + (imag1 * imag2)) / denominator;
double imag = ((imag1 * real2) - (real1 * imag2)) / denominator;
if (imag < 0) {
System.out.println("Quotient: " + real + " " + imag + "i");
} else {
System.out.println("Quotient: " + real + " + " + imag + "i");
}
}

void display() {
System.out.print("\nFirst expression: " + real1);
System.out.println(imag1 < 0 ? " " + imag1 + "i" : " + " + imag1 + "i");
System.out.print("Second expression: " + real2);
System.out.println(imag2 < 0 ? " " + imag2 + "i" : " + " + imag2 + "i");
}
}

public class ComplexClass {
public static void main(String args[]) {
Complex c = new Complex();
c.input();
c.display();
c.sum();
c.sub();
c.mult();
c.div();
}
}
