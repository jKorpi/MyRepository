
public class TransferToTransaction extends Transaction {

private String toName;
	
	public TransferToTransaction(int amount, String to) {
		super(amount);
		toName = to;
	}
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " transfer to " + toName);

	}
}
