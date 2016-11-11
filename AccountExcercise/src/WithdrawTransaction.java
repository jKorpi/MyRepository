
public class WithdrawTransaction extends Transaction {

	public  WithdrawTransaction(int amount) {
		super(amount);
	}
	
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " withdrawn");

	}

}
