package TopBrainsWrapperClass;

public class BankingTransactionLimitValidator {
	public static void main(String[] args) {
		BankAccount[] bank = {
			new BankAccount(101,20000,15000),	
			new BankAccount(102,20000,18000),	
			new BankAccount(103,20000,10000)	
		};
		
		Integer[] ta = {3000,3000,null};
		
		TransactionValidator tv = new TransactionValidator();
		
		for(int i=0;i<bank.length;i++) {
			tv.isTransactionAllowed(bank[i], ta[i]);
		}
	}
}

class BankAccount{
	Integer accountNumber;
	Integer dailyLimit;
	Integer withdrawnAmount;
	
	BankAccount(Integer accountNumber,Integer dailyLimit,Integer withdrawnAmount){
		this.accountNumber = accountNumber;
		this.dailyLimit = dailyLimit;
		this.withdrawnAmount = withdrawnAmount;
	}
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	
	public Integer getDailyLimit() {
		return dailyLimit;
	}
	
	public Integer getWithdrawnAmount() {
		return withdrawnAmount;
	}
}

class TransactionValidator{
	public void isTransactionAllowed(BankAccount b,Integer transactionAmount) {
		if(transactionAmount == null) {
			System.out.println("Account "+b.getAccountNumber()+" --> Invalid Transaction Amount");
		}
		else if(b.getWithdrawnAmount() + transactionAmount > b.getDailyLimit()) {
			System.out.println("Account "+b.getAccountNumber()+" --> Transaction Declined (Limit Exceeded)");
		}
		else {
			updateWithdrawal(b,transactionAmount);
			System.out.println("Account "+b.getAccountNumber()+" --> Transaction Approved");
		}
	}
	
	public void updateWithdrawal(BankAccount b,Integer transactionAmount) {
		int a = b.getWithdrawnAmount();
		a += transactionAmount;
	}
}
