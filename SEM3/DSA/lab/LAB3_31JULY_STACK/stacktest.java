import java.util.Scanner;

class Stack {
    int s[];// this array stores the stacks elements
    int top;// the index of the current top element of the stack
    int size;// max size of the stack

    Stack() {
        size = 10;// default stack max capacity tat i set
        top = -1;
        s = new int[size];
    }

    Stack(int m) {
        size = m;
        top = -1;
        s = new int[size];
    }

    public void push(int a) {
        if (top >= size - 1) {
            System.out.println("stack is full");
        } else {
            s[++top] = a;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("empty");
            return -1;
        } else {
            return s[top--];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        } else {
            System.out.println("empty");
        }
    }
}

public class stacktest {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.push\n2.pop\n3.display\n4.exit");
            int ch = input.nextInt();
            if (ch == 4) {
                break;
            } else {
                switch (ch) {
                    case 1:
                        int element = input.nextInt();
                        s.push(element);
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        s.display();
                        break;
                }
            }
        }
    }
}
