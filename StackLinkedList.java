package selection;
import java.util.Scanner;
public class StackLinkedList {
	    // Node class
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Top of stack
	    static Node top = null;

	    // Size of stack
	    static int size = 0;

	    // Push operation
	    static void push(int value) {

	        Node newNode = new Node(value);

	        newNode.next = top;
	        top = newNode;

	        size++;

	        System.out.println(value + " pushed into stack.");
	    }

	    // Pop operation
	    static void pop() {

	        if (top == null) {
	            System.out.println("Stack Underflow! Stack is empty.");
	            return;
	        }

	        int value = top.data;

	        top = top.next;

	        size--;

	        System.out.println(value + " popped from stack.");
	    }

	    // Peek operation
	    static void peek() {

	        if (top == null) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.println("Top element = " + top.data);
	        }
	    }

	    // Display operation
	    static void display() {

	        if (top == null) {
	            System.out.println("Stack is empty.");
	            return;
	        }

	        Node current = top;

	        System.out.println("Stack elements:");

	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }

	    // isEmpty operation
	    static boolean isEmpty() {
	        return top == null;
	    }

	    // Size operation
	    static void showSize() {
	        System.out.println("Stack Size = " + size);
	    }

	    // Main method
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int choice;

	        do {

	            System.out.println("\n===== STACK USING LINKED LIST =====");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Size");
	            System.out.println("6. isEmpty");
	            System.out.println("7. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter value: ");
	                    int value = sc.nextInt();

	                    push(value);
	                    break;

	                case 2:
	                    pop();
	                    break;

	                case 3:
	                    peek();
	                    break;

	                case 4:
	                    display();
	                    break;

	                case 5:
	                    showSize();
	                    break;

	                case 6:
	                    if (isEmpty()) {
	                        System.out.println("Stack is Empty.");
	                    } else {
	                        System.out.println("Stack is NOT Empty.");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Program ended.");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 7);

	        sc.close();
	    }
	}

