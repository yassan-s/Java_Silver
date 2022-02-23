package chapter10_Exception_handling.Q11;

public class Sample {
	public void hello(String name) throws SampleException, TestException {
		if (name == null) {
			throw new SampleException();
		}
		if (" ".equals(name)) {
			throw new TestException();
		}
	}
}
// throws SampleException, TestException
// throws SampleException
// throws句は、非検査例外に該当する「TestException」に関して、記述する必要はない
