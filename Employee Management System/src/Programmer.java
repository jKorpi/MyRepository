
public class Programmer extends Employee {
	
	private int bonusBase;

	public Programmer(String fullName, String dateOfBirth, int salary, String gender, boolean companyPhone,
			int bonusBase) {
		super(fullName, dateOfBirth, salary, gender, companyPhone);
		this.bonusBase = bonusBase;
	}

	public int getBonusBase() {
		return bonusBase;
	}

	public void setBonusBase(int bonusBase) {
		this.bonusBase = bonusBase;
	}
	
	@Override
	public int calculateBonus(int salary) {
		int bonus = (salary / bonusBase);
		return bonus;
	}
	
	}

