import java.util.ArrayList;
import java.util.Scanner;

public class MainEMS {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeCatalog = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		
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
			System.out.println("4. Exit");
			break;
		case 2:
			System.out.println("What would you like to do?");
			System.out.println("1. Calculate bonus for employee");
			System.out.println("2. Calculate average salary");
			System.out.println("3. Calculate total bonus");
			System.out.println("4. Exit");
			break;
		case 3:
			System.out.println("Goodbye!");		
			break;
		case 4:
			System.out.println("Invalid choice. Try again!");
		}
	
		Technician technician1 = new Technician("Pin Jim", "29 May 1970", 33000, "female");
		Technician technician2 = new Technician("Lin Jen", "23 April 1991", 29000, "female");
		Administrator administrator1 = new Administrator("Tom Boll", "12 January 1979", 25000, "male");
		
		employeeCatalog.add(technician1);
		employeeCatalog.add(technician2);
		employeeCatalog.add(administrator1);
		
		System.out.println(employeeCatalog.size());
		
		System.out.println(technician1.getFullName() + " will get " + technician1.calculateBonus(technician1.getSalary()) + " kr in bonus.");
		System.out.println(administrator1.getFullName() + " is employee number " + administrator1.getId());
	}

}
