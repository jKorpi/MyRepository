
public class TestAccount {

public static void main(String[] args) {
		
		Account a1 = new Account("Ulf");
		Account a2 = new Account("Anna");
		
		a1.deposit(200);
		a1.withdraw(170);
		a1.deposit(100);
		a1.withdraw(50);
		a1.withdraw(50);
		
		a2.deposit(300);
		a2.deposit(100);
		a2.transferTo(100, a1);
		a2.withdraw(100);
		
		a1.printAll();
		a2.printAll();
		

	}
}

