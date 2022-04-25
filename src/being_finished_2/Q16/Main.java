package being_finished_2.Q16;

public class Main {

	public static void main(String[] args) {
		Sample s = new Sample();
		for (String str:s.getList()) {
			System.out.println(str);
		}
	}
}
// Mainクラスでは、util.Listは使っていないので、
// importする必要はない
