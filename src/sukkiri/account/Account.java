package sukkiri.account;

public class Account {
	String accountNumber;
	int balance;

	public String toString(){
		return "¥¥"+this.balance+"(口座番号"+this.accountNumber+")";
	}
	public boolean equals(Object o) {
		//thisの中身はAccountクラスの変数aが作られた場所
		if (this == o) {
		   return true;
		  }

		  if (o instanceof Account) {
		   Account a = (Account)o;
		   String an1 = this.accountNumber.trim();
		   String an2 = a.accountNumber.trim();
		   if (an1.equals(an2)) {
		    return true;
		   }
		  }
		  return false;
	}
}