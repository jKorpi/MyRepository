
public class Administrator extends Employee {
	
	public Administrator(String fullName, String dateOfBirth, int salary, String gender) {
		super(fullName, dateOfBirth, salary, gender);
				
		System.out.println("New administrator created!");
	}

	@Override
	public int calculateBonus(int salary) {
		int bonus = (salary);
		return bonus;
	}

}
