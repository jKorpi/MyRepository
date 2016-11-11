
public class Technician extends Employee {
	
		public Technician(String fullName, String dateOfBirth, int salary, String gender) {
			super(fullName, dateOfBirth, salary, gender);
					
			System.out.println("New technician created!");
		}
		
		
		@Override
		public int calculateBonus(int salary) {
			int bonus = (salary / 2);
			return bonus;
		}
	
	}


