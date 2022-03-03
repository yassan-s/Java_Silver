package sukkiri.account;

public class Main {

	public static void main(String[] args) {
		Account a =new Account();
		a.accountNumber ="4649";
		a.balance =1592;

		System.out.println(a);

		Account ex1 = a;
		// String ex1 ="4649";
		String ex2 =" 4649";
		String ex3 ="4444";

		if(a.equals(ex1)) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
		if(a.equals(ex2)== true) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
		if(a.equals(ex3)== true) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
	}

}
