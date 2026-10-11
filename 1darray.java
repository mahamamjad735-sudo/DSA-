package oop;
import java.util.Scanner;
public class Libraryarray{
	    static Scanner input = new Scanner(System.in);
	    static int[] books;
	    static int size = 0;
	    
	    public Libraryarray(int capacity) {
	        books = new int[capacity];
	    }
   
	    public static void addValue(int value) {
	        if (size == books.length) {
	            System.out.println("Array is full!");
	            return;
	        }          books[size] = value;
	        size++;
	        System.out.println("Book ID added successfully.");
	    }
	    
	    public static void insertAtIndex(int index, int value) {
	        if (size == books.length) {
	            System.out.println("Array is full!");
	            return;	        }
	        if (index < 0 || index > size) {
	            System.out.println("Invalid index!");
	            return;
	        }

	       
	        for (int i = size; i > index; i--) {
	            books[i] = books[i - 1];
	        }
	        books[index] = value;
	        size++;
	        System.out.println("Book ID inserted successfully.");
	    }
	  
	    public static void fillArray() {
	        while (size < books.length) {
	            System.out.print("Enter book ID: ");
	            int value = input.nextInt();

	            books[size] = value;
	            size++;

	            if (size == books.length) {
	                System.out.println("Array is now full.");
	                break;
	            }

	            System.out.print("Do you want to add another value? (y/n): ");
	            char choice = input.next().charAt(0);

	            if (choice == 'n' || choice == 'N') {
	                break;
	            }
	        }
	    }

	   
	    public static void deleteLast() {
	        if (size == 0) {
	            System.out.println("Array is empty!");
	            return;
	        }

	        size--;
	        System.out.println("Last book ID deleted.");
	    }

	    
	    public static void deleteByIndex(int index) {
	        if (size == 0) {
	            System.out.println("Array is empty!");
	            return;
	        }

	        if (index < 0 || index >= size) {
	            System.out.println("Invalid index!");
	            return;
	        }

	        // Shift elements to the left
	        for (int i = index; i < size - 1; i++) {
	            books[i] = books[i + 1];
	        }

	        size--;

	        System.out.println("Book ID deleted successfully.");
	    }

	  
	    public static void display() {
	        if (size == 0) {
	            System.out.println("Array is empty!");
	            return;
	        }

	        System.out.println("Book IDs on shelf:");

	        for (int i = 0; i < size; i++) {
	            System.out.println("Index " + i + " : " + books[i]);
	        }
	    }

	    
	    public static void searchValue(int value) {
	        for (int i = 0; i < size; i++) {
	            if (books[i] == value) {
	                System.out.println("Book ID found at index: " + i);
	                return;
	            }
	        }

	        System.out.println("Book ID not found.");
	    }

	  
	    public static void getValue(int index) {
	        if (index < 0 || index >= size) {
	            System.out.println("Invalid index!");
	            return;
	        }

	        System.out.println("Value at index " + index + " = " + books[index]);
	    }

	   
	    public static void updateValue(int index, int newValue) {
	        if (index < 0 || index >= size) {
	            System.out.println("Invalid index!");
	            return;
	        }

	        books[index] = newValue;

	        System.out.println("Book ID updated successfully.");
	    }

	    
	    public static void showSize() {
	        System.out.println("Current size = " + size);
	    }

	  
	    public static void main(String[] args) {

	        System.out.print("Enter maximum shelf capacity: ");
	        int capacity = input.nextInt();

	        Libraryarray library = new Libraryarray(capacity);

	        int choice;

	        do {
	            System.out.println("\n----- ARRAY MENU -----");
	            System.out.println("1. Add value");
	            System.out.println("2. Insert at index");
	            System.out.println("3. Fill array");
	            System.out.println("4. Delete last element");
	            System.out.println("5. Delete by index");
	            System.out.println("6. Display");
	            System.out.println("7. Search value");
	            System.out.println("8. Get value at index");
	            System.out.println("9. Replace/Update value at index");
	            System.out.println("10. Size");
	            System.out.println("11. Exit");

	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter book ID: ");
	                    int value = input.nextInt();
	                    addValue(value);
	                    break;

	                case 2:
	                    System.out.print("Enter index: ");
	                    int insertIndex = input.nextInt();

	                    System.out.print("Enter book ID: ");
	                    int insertValue = input.nextInt();

	                    insertAtIndex(insertIndex, insertValue);
	                    break;

	                case 3:
	                    fillArray();
	                    break;

	                case 4:
	                    deleteLast();
	                    break;

	                case 5:
	                    System.out.print("Enter index to delete: ");
	                    int deleteIndex = input.nextInt();

	                    deleteByIndex(deleteIndex);
	                    break;

	                case 6:
	                    display();
	                    break;

	                case 7:
	                    System.out.print("Enter book ID to search: ");
	                    int search = input.nextInt();

	                    searchValue(search);
	                    break;

	                case 8:
	                    System.out.print("Enter index: ");
	                    int getIndex = input.nextInt();

	                    getValue(getIndex);
	                    break;

	                case 9:
	                    System.out.print("Enter index: ");
	                    int updateIndex = input.nextInt();

	                    System.out.print("Enter new book ID: ");
	                    int newValue = input.nextInt();

	                    updateValue(updateIndex, newValue);
	                    break;

	                case 10:
	                    showSize();
	                    break;

	                case 11:
	                    System.out.println("Program terminated.");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 11);

	        input.close();
	    }  
	}

