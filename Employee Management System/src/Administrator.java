
public class Administrator extends Employee {
	
	private int bonusBase;
	
	public Administrator(String fullName, String dateOfBirth, int salary, String gender, int bonusBase) {
		super(fullName, dateOfBirth, salary, gender);
		this.bonusBase = bonusBase;
	}

	public int getBonusBase() {
		return bonusBase;
	}

	@Override
	public int calculateBonus(int salary) {
		int bonus = (salary * bonusBase);
		return bonus;
	}

}
