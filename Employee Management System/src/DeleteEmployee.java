
public class DeleteEmployee {

	public static void deleteEmployee() {
		System.out.println("Please provide the employee's id number!");
		int idNumber = UserInterface.readNumber();

		boolean foundIt = false;
		Employee bardia = null;
		for (Employee e : MainEMS.employee1) {
			if (e.getId() == (idNumber)) {
				System.out.println("Are you sure you want to delete? (Y/N)");
				String answer = UserInterface.readText();
				if (answer.equalsIgnoreCase("Y")) {
					bardia = e;
					System.out.println("Employee deleted!");
					System.out.println();

				} 
			}
		}
		MainEMS.employee1.remove(bardia);
		UserInterface.employeeManagementMenu();




	}
}
