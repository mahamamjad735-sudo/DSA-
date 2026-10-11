package selection;
import java.util.Scanner;
public class QueueLinkedList {

	    // Node class
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Front and Rear
	    static Node front = null;
	    static Node rear = null;

	    // Size of queue
	    static int size = 0;

	    // Enqueue
	    static void enqueue(int value) {

	        Node newNode = new Node(value);

	        // If queue is empty
	        if (rear == null) {
	            front = newNode;
	            rear = newNode;
	        } 
	        else {
	            rear.next = newNode;
	            rear = newNode;
	        }

	        size++;

	        System.out.println(value + " inserted into queue.");
	    }

	    // Dequeue
	    static void dequeue() {

	        // Check empty
	        if (front == null) {
	            System.out.println("Queue Underflow! Queue is empty.");
	            return;
	        }

	        int value = front.data;

	        front = front.next;

	        // If queue becomes empty
	        if (front == null) {
	            rear = null;
	        }

	        size--;

	        System.out.println(value + " removed from queue.");
	    }

	    // Peek
	    static void peek() {

	        if (front == null) {
	            System.out.println("Queue is empty.");
	        } 
	        else {
	            System.out.println("Front element = " + front.data);
	        }
	    }

	    // Display
	    static void display() {

	        if (front == null) {
	            System.out.println("Queue is empty.");
	            return;
	        }

	        Node current = front;

	        System.out.println("Queue elements:");

	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }

	        System.out.println();
	    }

	    // Check if empty
	    static boolean isEmpty() {
	        return front == null;
	    }

	    // Show size
	    static void showSize() {
	        System.out.println("Queue Size = " + size);
	    }

	    // Main method
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int choice;

	        do {

	            System.out.println("\n===== QUEUE USING LINKED LIST =====");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
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

	                    enqueue(value);
	                    break;

	                case 2:
	                    dequeue();
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
	                        System.out.println("Queue is Empty.");
	                    } 
	                    else {
	                        System.out.println("Queue is NOT Empty.");
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

