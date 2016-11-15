
public class AddEmployee {

	public static void add (){
		
		
	System.out.println("Input name, please.");
	String fullName = UserInterface.readText();
	System.out.println("Input gender (male, female or unknown)");
	String gender = UserInterface.readText();
	System.out.println("Input birth date.");
	String birthDate = UserInterface.readText();
	System.out.println("Input salary.");
	int salary = UserInterface.readNumber();
	System.out.println("Input occupation: 1. programmer, 2. technician, 3. administrator");
	int occupation = UserInterface.readNumber();

	if (occupation.equalsIgnoreCase("programmer")) {
		Programmer programmer = new Programmer(firstName, surName, salary, gender, birthDate, idNumber);
		employee1.add(programmer);
	} else if (occupation.equalsIgnoreCase("technition")) {
		Technition technition = new Technition(firstName, surName, salary, gender, birthDate, idNumber);
		employee1.add(technition);
	} else if (occupation.equalsIgnoreCase("receptionist")) {
		Receptionist receptionist = new Receptionist(firstName, surName, salary, gender, birthDate,
				idNumber);
		employee1.add(receptionist);

}
}