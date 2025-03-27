interface Stack {
    int size = 5; 
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    private int[] stack = new int[size];
    private int top = -1;

   
    public void push(int element) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stack[++top] = element;
        System.out.println("Pushed: " + element);
    }

  
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        int poppedElement = stack[top--];
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }

  
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

public class TestStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        stack.pop(); 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); 
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}