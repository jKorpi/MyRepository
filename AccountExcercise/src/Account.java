
public class Account {
	private String owner;
	private int number;
	private int balance;
	private static int numberOfAccounts = 0;
	
	private Transaction[] transactionList;
	private int nTransactions;
	
	public Account(String o){
		owner = o;
		balance = 0;
		numberOfAccounts++;
		number = numberOfAccounts;
		transactionList = new Transaction[1000];
		nTransactions = 0;
		transactionList[nTransactions] = new CreationTransaction();
		nTransactions++;
	}
	
	public void deposit (int amount){
		balance += amount;
		transactionList[nTransactions] = new DepositTransaction(amount);
		nTransactions++;
	}
	
	public void withdraw(int amount){
		balance -= amount;
		transactionList[nTransactions] = new WithdrawTransaction(amount);
		nTransactions++;
	}
	
	public void transferTo(int amount, Account to){
		balance -= amount;
		to.balance += amount;
		transactionList[nTransactions] = new TransferToTransaction(amount, to.owner);
		nTransactions++;
		to.transactionList[nTransactions] = new TransferFromTransaction(amount, owner);
		to.nTransactions++;
		
	}
	
	public void printAll() {
		System.out.println(number + "/" + owner + ":" + balance);
		System.out.println("Transactions:");
		for (int i = 0; i < nTransactions; i++){
			 transactionList[i].printTransaction();
		}
	}

}
