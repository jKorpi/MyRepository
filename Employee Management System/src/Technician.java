
public class Technician extends Employee {
		
		public Technician(String firstName, String lastName, String dateOfBirth, int salary, int gender, boolean companyPhone) {
			super(firstName, lastName, dateOfBirth, salary, gender, companyPhone);
		}
		
	

		@Override
		public int calculateBonus(int salary) {
			int bonus = (int)(salary*0.05);
			return bonus;
		}
	
	}


