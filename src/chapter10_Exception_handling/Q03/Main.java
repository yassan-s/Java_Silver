package chapter10_Exception_handling.Q03;

public class Main {

	public static void main(String[] args) {
		try {
			sample();
			sub();
		} catch (SampleException e ) {
			System.out.println("A");
		} catch (SubSampleException e) {
			System.out.println("B");
		}
	}

	private static void sample() throws SampleException {
		throw new SampleException();
	}
	private static void sub() throws SubSampleException {
		throw new SubSampleException();
	}
}
// 1つ目のcatchブロックでSubSampleException型で受け取ることができる
// 従って、2つ目のcatchブロックは到達不可能のコードとなり、コンパイルエラーになる