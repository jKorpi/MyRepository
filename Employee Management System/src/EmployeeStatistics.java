
public class EmployeeStatistics {

	public static void employeeStats(int num) {

		switch (num) {
		case 1:
			System.out.println("The average salary is: " + StatisticsHelper.averageSalary());
			break;
		case 2:
			System.out.println("The maximum salary is: " + StatisticsHelper.maxSalary());
			break;
		case 3:
			System.out.println("The minimum salary is: " + StatisticsHelper.minSalary());
			break;
		case 4:
			System.out.println("The total bonus is: " + StatisticsHelper.totalBonus());
			break;
		case 5:
			// women percentage
			break;
		case 0:
			UserInterface.mainMenu();
		}

		System.out.println();
		UserInterface.employeeStatisticsMenu();
	}

}
