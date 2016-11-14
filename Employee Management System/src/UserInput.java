import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

	static ArrayList<Employee> employeeCatalog = new ArrayList<Employee>();
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void firstChoice() {
		System.out.println("What would you like to do?");
		System.out.println("1. Employee Management");
		System.out.println("2. Employee Statistics");
		System.out.println("3. Exit");
		
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("What would you like to do?");
			System.out.println("1. Add employee");
			System.out.println("2. Delete employee");
			System.out.println("3. Update name of employee");
			System.out.println("4. Back to Main Menu");
			
			int choice2 = scanner.nextInt();
			
			switch (choice2) {
		case 1: 
			System.out.println("Adding employee");
			break;
		case 2:
			System.out.println("Who would you like to delete? (input employee number)");
			int e = scanner.nextInt();
		
			System.out.println("Deleting employee number " + e);
			break;
		case 3:
			System.out.println("Updating name of employee");
			break;
		case 4:
			System.out.println("Returning to Main Menu");
		default:
			System.out.println("Invalid input");
			}
			
			break;
			
		case 2:
			System.out.println("What would you like to do?");
			System.out.println("1. Calculate bonus for employee");
			System.out.println("2. Calculate average salary");
			System.out.println("3. Calculate total bonus");
			System.out.println("4. Return to Main Menu");
			break;
		case 3:
			System.out.println("Goodbye!");		
			break;
		case 4:
			System.out.println("Invalid choice. Try again!");
		}
	}
}
