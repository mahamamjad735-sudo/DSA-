package selection;
import java.util.Scanner;
public class TwoDArray {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in) ;
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        // Create 2D array
	        int[][] arr = new int[rows][cols];

	        // Input elements
	        System.out.println("\nEnter array elements:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("arr[" + i + "][" + j + "] = ");
	                arr[i][j] = sc.nextInt();
	            }
	        }

	        // Display array
	        System.out.println("\n2D Array:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        // Find sum of all elements
	        int sum = 0;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sum = sum + arr[i][j];
	            }
	        }

	        System.out.println("\nSum of all elements = " + sum);

	        // Find largest element
	        int largest = arr[0][0];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (arr[i][j] > largest) {
	                    largest = arr[i][j];
	                }
	            }
	        }

	        System.out.println("Largest element = " + largest);

	        // Search an element
	        System.out.print("\nEnter element to search: ");
	        int search = sc.nextInt();

	        boolean found = false;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {

	                if (arr[i][j] == search) {
	                    System.out.println("Element found at index [" 
	                                       + i + "][" + j + "]");
	                    found = true;
	                }
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found.");
	        }

	        // Row sums
	        System.out.println("\nSum of each row:");

	        for (int i = 0; i < rows; i++) {

	            int rowSum = 0;

	            for (int j = 0; j < cols; j++) {
	                rowSum = rowSum + arr[i][j];
	            }

	            System.out.println("Row " + i + " sum = " + rowSum);
	        }

	        // Column sums
	        System.out.println("\nSum of each column:");

	        for (int j = 0; j < cols; j++) {

	            int colSum = 0;

	            for (int i = 0; i < rows; i++) {
	                colSum = colSum + arr[i][j];
	            }

	            System.out.println("Column " + j + " sum = " + colSum);
	        }

	        // Transpose
	        System.out.println("\nTranspose of Array:");

	        for (int j = 0; j < cols; j++) {
	            for (int i = 0; i < rows; i++) {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}

