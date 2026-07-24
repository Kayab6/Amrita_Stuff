import java.util.Scanner;

class MatrixFormat {
    // Structural variables for both matrices
    int rows1, cols1;
    int rows2, cols2;
    double[][] mat1;
    double[][] mat2;

    // Method to take all inputs at once
    void input() {
        Scanner s = new Scanner(System.in);

        // Matrix 1 Input
        System.out.print("Enter rows and columns for first matrix: ");
        rows1 = s.nextInt();
        cols1 = s.nextInt();
        mat1 = new double[rows1][cols1];
        System.out.println("Enter elements for first matrix row by row:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = s.nextDouble();
            }
        }

        // Matrix 2 Input
        System.out.print("\nEnter rows and columns for second matrix: ");
        rows2 = s.nextInt();
        cols2 = s.nextInt();
        mat2 = new double[rows2][cols2];
        System.out.println("Enter elements for second matrix row by row:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = s.nextDouble();
            }
        }
    }

    // Addition operation
    void sum() {
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("\nSum: Cannot add matrices. Dimensions mismatch!");
            return;
        }
        System.out.println("\nSum Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print((mat1[i][j] + mat2[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Subtraction operation
    void sub() {
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("\nDifference: Cannot subtract matrices. Dimensions mismatch!");
            return;
        }
        System.out.println("\nDifference Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print((mat1[i][j] - mat2[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Multiplication operation
    void mult() {
        if (cols1 != rows2) {
            System.out.println("\nProduct: Cannot multiply matrices. Columns of 1st must equal Rows of 2nd!");
            return;
        }
        System.out.println("\nProduct Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                double elementSum = 0;
                for (int k = 0; k < cols1; k++) {
                    elementSum += mat1[i][k] * mat2[k][j];
                }
                System.out.print(elementSum + " ");
            }
            System.out.println();
        }
    }

    // Method to preview entered inputs
    void display() {
        System.out.println("\n--- First Matrix Given ---");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--- Second Matrix Given ---");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MainMatrix {
    public static void main(String args[]) {
        MatrixFormat m = new MatrixFormat();
        m.input();
        m.display();
        m.sum();
        m.sub();
        m.mult();
    }
}
