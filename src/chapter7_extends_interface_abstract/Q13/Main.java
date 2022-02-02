package chapter7_extends_interface_abstract.Q13;

public class Main {

	public static void main(String[] args) {
		Worker worker = new Engineer();
		worker.work(); // work

	}
}

// Workerインタフェースに規定されたメソッドを呼び出している
// Engineerクラスの親クラスである、Employeeが提供するwork()メソッドが呼び出される
