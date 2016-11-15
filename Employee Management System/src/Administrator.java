
public class Administrator extends Employee {
	
	private int bonusBase;
	
	public Administrator(String fullName, String dateOfBirth, int salary, String gender, int bonusBase, boolean companyPhone) {
		super(fullName, dateOfBirth, salary, gender, companyPhone);
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
