package oop;
import java.util.Scanner;
public class BankQueue {
	    static int[] queue;
	    static int front = 0;
	    static int rear = -1;
	    static int size = 0;
	 
	    public BankQueue(int capacity) {
	        queue = new int[capacity];
	    }
    
	    public static void enqueue(int value) {
	        if (isFull()) {
	            System.out.println("Queue is Full!");
	            return;
	        }
	        rear++;
	        queue[rear] = value;
	        size++;
	        System.out.println("Token " + value + " added to queue.");
	    }
	 
	    public static void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty!");
	            return;
	        }
	        int value = queue[front];
	        front++;
	        size--;
        System.out.println("Token " + value + " served and removed.");
	    }
	    
	    public static void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty!");
	            return;
	        }
	        System.out.println("Queue values:");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }
	    
	    public static void showSize() {
	        System.out.println("Current Queue Size = " + size);
	    }
	   
	    public static boolean isEmpty() {
	        return size == 0;
	    }
	   
	    public static boolean isFull() {
	        return size == queue.length;	    }
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter maximum queue capacity: ");
	        int capacity = input.nextInt();
	        BankQueue q = new BankQueue(capacity);
	        int choice;
	        do {
	            System.out.println("\n----- QUEUE MENU -----");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Display");
	            System.out.println("4. Size");
	            System.out.println("5. isEmpty");
	            System.out.println("6. isFull");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter token number: ");
	                    int token = input.nextInt();
	                    q.enqueue(token);
	                    break;
	                case 2:
	                    q.dequeue();
	                    break;
                case 3:
	                    q.display();
	                    break;
	                case 4:
	                    q.showSize();
	                    break;
	                case 5:
	                    if (q.isEmpty()) {
	                        System.out.println("Queue is Empty.");
	                    } else {
	                        System.out.println("Queue is NOT Empty.");
	                    }
	                    break;

	                case 6:
	                    if (q.isFull()) {
	                        System.out.println("Queue is Full.");
	                    } else {
	                        System.out.println("Queue is NOT Full.");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Program terminated.");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");

	            }
	        } while (choice != 7);

	        input.close();
	    }
	}

