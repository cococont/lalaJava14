package ex14;

public class Account {
	String accountNumver;
	int balance;
	
	public Account(String accountNumver, int balance) {
		this.accountNumver = accountNumver;
		this.balance = balance;
	}

	public String toString() {
		return "\\" + this.balance + "(口座番号:" + this.accountNumver + ")";
	}
	
	public String getAccountNumver() {
		return accountNumver;
	}

	public void setAccountNumver(String accountNumver) {
		this.accountNumver = accountNumver;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Account) {
			Account other = (Account) obj;
			String a1 = this.accountNumver.trim();
			String a2 = other.accountNumver.trim();
			if (a1.equals(a2)) {
				return true;
			}
		}
		return false;
	}
	
}
