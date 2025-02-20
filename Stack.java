import java.util.Scanner;

class Stack {
    private int top;
    private int maxSize;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(5);

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped value: " + popped);
                    }
                    break;
                case 3:
                    int peeked = stack.peek();
                    if (peeked != -1) {
                        System.out.println("Top value: " + peeked);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
