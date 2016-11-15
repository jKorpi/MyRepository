import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	static ArrayList<Employee> employeeCatalog = new ArrayList<Employee>();
	static Scanner scanner = new Scanner(System.in);
	static int intChoice;
	static String stringChoice;
	
	
	public static int mainMenu() {
		System.out.println("Welcome to the Employee Management System.");
		System.out.println("What would you like to do?");
		System.out.println("1. Employee Management");
		System.out.println("2. Employee Statistics");
		System.out.println("0. Exit");
		int choice=readNumber();
		return choice;
		
	}
		
	public static int employeeManagementMenu() {
			System.out.println("What would you like to do?");
			System.out.println("1. Add employee");
			System.out.println("2. Delete employee");
			System.out.println("3. Update name of employee");
			System.out.println("0. Return to Main Menu");
			int choice=readNumber();
			return choice;

		}
	
	public static int employeeStatisticsMenu () {
		System.out.println("What would you like to do?");
		System.out.println("1. Calculate bonus for employee");
		System.out.println("2. Calculate average salary");
		System.out.println("3. Calculate total bonus");
		System.out.println("4. Return to Main Menu");
		int choice=readNumber();
		return choice;
		 
	}
	
	public static int readNumber() {
		intChoice = scanner.nextInt();
		scanner.nextLine();
		
		return intChoice;
	}
	
	public static String readText() {
		stringChoice = scanner.nextLine();
		
		return stringChoice;
	}
		
	
		}
