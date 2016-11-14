import java.util.ArrayList;
import java.util.Scanner;

public class MainEMS {

	public static void main(String[] args) {

	UserInput.employeeCatalog.add(new Technician("Pin Jim", "29 May 1970", 33000, "female", 10));
	UserInput.employeeCatalog.add(new Technician("Lin Jen", "23 April 1991", 29000, "female", 10));
	UserInput.employeeCatalog.add(new Administrator("Tom Boll", "12 January 1979", 25000, "male", 5));
	
	UserInput.firstChoice();
		
		
		System.out.println(UserInput.employeeCatalog.size());
		System.out.println(UserInput.employeeCatalog.get(1)); //standard toString method
		

		for (Employee e : UserInput.employeeCatalog) { //e = element in list
		System.out.println(e.toString());
		}
		
		int totalSalary = 0;
		for (Employee e : UserInput.employeeCatalog)  {
			totalSalary += e.getSalary();
		}
		System.out.println((double) totalSalary / UserInput.employeeCatalog.size());

		
		for (Employee e : UserInput.employeeCatalog)  {
			System.out.println(e.getId() + " " + e.getFullName());
	}

	
	}
	}
 