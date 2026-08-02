import java.util.Scanner;

class Stack {
    int s[];
    int top;
    int size;

    Stack() {
        size = 10;
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
public class Solution {
    public static void main
    {// here we are gonna call the remove duplicates functionb
    
    }
    public String removeDuplicates(String s) {

        
        
    }
}
