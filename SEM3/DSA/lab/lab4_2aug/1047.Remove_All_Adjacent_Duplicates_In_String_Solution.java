// 1047. Remove All Adjacent Duplicates In String
import java.util.Scanner;

class Stack {
    char s[];
    int top;
    int size;

    Stack() {
        size = 10;
        top = -1;
        s = new char[size];
    }

    Stack(int m) {
        size = m;
        top = -1;
        s = new char[size];
    }

    public void push(char a) {
        if (top >= size - 1) {
            System.out.println("Stack is full");
        } else {
            s[++top] = a;
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        } else {
            return s[top--];
        }
    }

    public char peek() {
        if (top == -1) {
            return '\0';
        }
        return s[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void display() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }
}

public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    System.out.print("Enter your word: ");
    String str = sc.nextLine();
    String result = obj.removeDuplicates(str);
    System.out.println("After removing duplicates: " + result);

    sc.close();
}

    public String removeDuplicates(String str) {

        Stack stack = new Stack(str.length());

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        char[] ans = new char[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return new String(ans);
    }
}
