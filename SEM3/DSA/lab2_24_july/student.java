import java.util.Scanner;

public class StudentClass {
    
    int rollNo;
    String name;
    double[] marks = new double[5];
    double total;
    double average;
    char grade;

    // Methods belong to the student object itself now
    public void calculateTotal() {
        this.total = 0;
        for (double mark : this.marks) {
            this.total += mark;
        }
    }

    public void calculateAverage() {
        this.average = this.total / 5;
    }

    public void calculateGrade() {
        // Added parentheses to fix the operator precedence bug
        int scoreRange = (int) (this.average / 10); 

        switch (scoreRange) {
            case 10:
            case 9:
                this.grade = 'A';
                break;
            case 8:
                this.grade = 'B';
                break;
            case 7:
                this.grade = 'C';
                break;
            case 6:
                this.grade = 'D';
                break;
            case 5:
                this.grade = 'P';
                break;
            default:
                this.grade = 'F';
                break;
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name   : " + this.name);
        System.out.println("Total  : " + this.total);
        System.out.println("Average: " + this.average);
        System.out.println("Grade  : " + this.grade);
    }

    // Main execution method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        StudentClass[] classroom = new StudentClass[n];

        for (int i = 0; i < n; i++) {
            classroom[i] = new StudentClass();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Roll No: ");
            classroom[i].rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            classroom[i].name = scanner.nextLine();

            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                classroom[i].marks[j] = scanner.nextDouble();
            }

            // The object now manages its own calculations
            classroom[i].calculateTotal();
            classroom[i].calculateAverage();
            classroom[i].calculateGrade();
        }

        System.out.println("\n========== DISPLAYING ALL RESULTS ==========");
        for (StudentClass s : classroom) {
            s.displayDetails();
        }

        scanner.close();
    }
}s
