import java.util.ArrayList;
import java.util.Scanner;

public class MainEMS {
	
	static ArrayList<Employee> employee1 = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	
	
	public static void main(String[] args) {
boolean loop=true;

		while(loop){
			
		int choice= UserInterface.mainMenu();
		
	switch (choice) {
	case 1:
		int num = UserInterface.employeeManagementMenu();
       EmployeeManagement.takeCareOfEmployee(num);	
         break;
	case 2:
		num = UserInterface.employeeStatisticsMenu();
	
	}
	
		

	}
}
}