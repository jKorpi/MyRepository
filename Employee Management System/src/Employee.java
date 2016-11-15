
public abstract class Employee {
	
	private String fullName;
	private String dateOfBirth;
	private int salary;
	private String gender;
	private int id;
	private boolean companyPhone;
	
	static int numberOfEmployees = 0;
	
	public Employee(String fullName, String dateOfBirth, int salary, String gender, boolean companyPhone) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
		this.gender = gender;
		numberOfEmployees++;
		this.id = numberOfEmployees;
	}

	public String getFullName() {
		return fullName;
	}

	public boolean isCompanyPhone() {
		return companyPhone;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public int getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public abstract int calculateBonus(int salary);

//	@Override
//	public String toString() {
//		return "Name: " + fullName + ", id: " + id;
//	}
		
	}
	
	
