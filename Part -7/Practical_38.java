import java.util.ArrayList;
import java.util.Scanner;

class Stack {

    ArrayList array = new ArrayList();


    public boolean isEmpty() {
        return array.isEmpty();
    }


    public int getSize() {
        return array.size();
    }


    public void push(int x) {
        array.add(x);
        System.out.println("Element " + x + " added to stack successfully.");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow!!");

        } else {
             int y = (int) array.remove(array.size() - 1);
            System.out.println("Element " + y +" is removed from stack successfully.");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        return (int) array.get(array.size() - 1);
    }


    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + array);
        }
    }
}

public class Practical_38 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. PUSH\n2. POP\n3. PEEK\n4. DISPLAY\n5. EXIT");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value that you want to add: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    int topElement = stack.peek();
                    if (topElement != 0) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid input!!");
                    break;
            }
        } while (choice != 5);
    }
}
