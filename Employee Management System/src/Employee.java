
public abstract class Employee {
	
	private String fullName;
	private String dateOfBirth;
	private int salary;
	private String gender;
	private int id;
	
	int numberOfEmployees = 0;
	
	public Employee(String fullName, String dateOfBirth, int salary, String gender) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
		this.gender = gender;
		numberOfEmployees++;
		id = numberOfEmployees;
	}

	public String getFullName() {
		return fullName;
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
		
	}
	
	
