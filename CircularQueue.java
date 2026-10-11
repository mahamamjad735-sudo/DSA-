package selection;
import java.util.Scanner;
public class CircularQueue {
	     static int[] queue;
	    static int front = -1;
	    static int rear = -1;
	    static int size = 0;

	    // Check if queue is empty
	    static boolean isEmpty() {
	        return size == 0;
	    }

	    // Check if queue is full
	    static boolean isFull() {
	        return size == queue.length;
	    }

	    // Enqueue
	    static void enqueue(int value) {

	        if (isFull()) {
	            System.out.println("Queue is Full!");
	            return;
	        }

	        if (isEmpty()) {
	            front = 0;
	            rear = 0;
	        } else {
	            rear = (rear + 1) % queue.length;
	        }

	        queue[rear] = value;
	        size++;

	        System.out.println(value + " inserted into queue.");
	    }

	    // Dequeue
	    static void dequeue() {

	        if (isEmpty()) {
	            System.out.println("Queue is Empty!");
	            return;
	        }

	        int value = queue[front];

	        if (size == 1) {
	            front = -1;
	            rear = -1;
	        } else {
	            front = (front + 1) % queue.length;
	        }

	        size--;

	        System.out.println(value + " removed from queue.");
	    }

	    // Peek
	    static void peek() {

	        if (isEmpty()) {
	            System.out.println("Queue is Empty!");
	        } else {
	            System.out.println("Front element = " + queue[front]);
	        }
	    }

	    // Display
	    static void display() {

	        if (isEmpty()) {
	            System.out.println("Queue is Empty!");
	            return;
	        }

	        System.out.println("Circular Queue:");

	        int i = front;

	        for (int count = 0; count < size; count++) {
	            System.out.print(queue[i] + " ");

	            i = (i + 1) % queue.length;
	        }

	        System.out.println();
	    }

	    // Size
	    static void showSize() {
	        System.out.println("Queue Size = " + size);
	    }

	    // Main method
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of Circular Queue: ");
	        int capacity = sc.nextInt();

	        queue = new int[capacity];

	        int choice;

	        do {

	            System.out.println("\n===== CIRCULAR QUEUE MENU =====");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Size");
	            System.out.println("6. isEmpty");
	            System.out.println("7. isFull");
	            System.out.println("8. Exit");

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
	                    } else {
	                        System.out.println("Queue is NOT Empty.");
	                    }
	                    break;

	                case 7:
	                    if (isFull()) {
	                        System.out.println("Queue is Full.");
	                    } else {
	                        System.out.println("Queue is NOT Full.");
	                    }
	                    break;

	                case 8:
	                    System.out.println("Program ended.");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 8);

	        sc.close();
	    }
	}

