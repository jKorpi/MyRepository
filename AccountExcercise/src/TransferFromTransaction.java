
public class TransferFromTransaction extends Transaction {

	private String fromName;
	
	public TransferFromTransaction(int amount, String from) {
		super(amount);
		fromName = from;
	}
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " transfer from " + fromName);

	}

}
