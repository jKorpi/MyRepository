import java.util.ArrayList;

public class EmployeeCatalog {
	
	private ArrayList<Employee> employeeCatalog = new ArrayList<Employee>();

	public ArrayList<Employee> getEmployeeCatalog() {
		return employeeCatalog;
	}
	
	public void addEmployee(Employee e) {
		employeeCatalog.add(e);
	}
	
	public void deleteEmployee(Employee e) {
		employeeCatalog.remove(e);
	}
	
//	public Employee findEmployee(String fullName) {
//		for (int i = 0; i < employeeCatalog.size(); i++) {
//			if (employeeCatalog.get(i).equals(fullName)) {
//				return employeeCatalog.get(i);
//			}

		}


