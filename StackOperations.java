package oop;
import java.util.Scanner;
public class StackOperations {
	    static int MAX = 7;
	    static int[] stack = new int[MAX];
	    static int top = -1;
	    static Scanner sc = new Scanner(System.in);

	
	    public static void push() {
	        if (isFull()) {
	            System.out.println("Stack Overflow! Cannot push.");
	            return;
	        }
	        System.out.print("Enter value to push: ");
	        int val = sc.nextInt();
	        top++;
	        stack[top] = val;
	        System.out.println(val + " pushed to stack.");
	    }

	    
	    public static void pop() {
	        if (isEmpty()) {
	            System.out.println("Stack Underflow! Nothing to pop.");
	            return;
	        }
	        int val = stack[top];
	        top--;
	        System.out.println(val + " popped from stack.");
	    }

	    
	    public static void display() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	            return;
	        }
	        System.out.print("Stack [Top -> Bottom]: ");
	        for (int i = top; i >= 0; i--) {
	            System.out.print(stack[i] + " ");
	        }
	        System.out.println();
	    }

	    
	    public static void size() {
	        System.out.println("Current size: " + (top + 1));
	    }

	    
	    public static boolean isEmpty() {
	        return top == -1;
	    }

	   
	    public static boolean isFull() {
	        return top == MAX - 1;
	    }

	    
	    public static void main(String[] args) {
	        int choice;
	        do {
	            System.out.println("\n----- STACK MENU -----");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Display");
	            System.out.println("4. Size");
	            System.out.println("5. isEmpty");
	            System.out.println("6. isFull");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: push(); break;
	                case 2: pop(); break;
	                case 3: display(); break;
	                case 4: size(); break;
	                case 5: System.out.println(isEmpty()? "Stack is Empty" : "Stack is Not Empty"); break;
	                case 6: System.out.println(isFull()? "Stack is Full" : "Stack is Not Full"); break;
	                case 7: System.out.println("Exiting..."); break;
	                default: System.out.println("Invalid choice!");
	            }
	        } while (choice!= 7);
	        
	        sc.close();
	    }
	}

