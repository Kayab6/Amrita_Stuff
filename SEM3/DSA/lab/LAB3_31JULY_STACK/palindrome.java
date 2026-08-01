import java.util.Scanner;

class Stack {
    char s[];// this array stores the stacks elements
    int top;// the index of the current top element of the stack
    int size;// max size of the stack

    Stack() {
        size = 10;// default stack max capacity tat i set
        top = -1;
        s = new char[size];
    }

    Stack(int m) {
        size = m;
        top = -1;
        //s = new int[size];
        s = new char[size];
    }

    public void push(char a) {
        if (top >= size - 1) {
            System.out.println("stack is full");
        } else {
            s[++top] = a;
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("empty");
            return '\0';
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
    boolean isPalindrome(String str) {
    top = -1; // empty the stack

    // Push all characters
    for (int i = 0; i < str.length(); i++) {
        push(str.charAt(i));
    }

    // Compare while popping
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != (char) pop()) {
            return false;
        }
    }

    return true;
}
}

public class palindrome {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.push\n2.pop\n3.display\n4.palindrome\n5.exit");
            int ch = input.nextInt();
            if (ch == 5) {
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
                    case 4:
    System.out.print("Enter a string: ");
    String str = input.next();

    Stack st = new Stack(str.length());

    for (int i = 0; i < str.length(); i++) {
        st.push(str.charAt(i));
    }

    boolean palindrome = true;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != st.pop()) {
            palindrome = false;
            break;
        }
    }

    if (palindrome)
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");

    break;
                        


                }
            }
        }
    }
}
