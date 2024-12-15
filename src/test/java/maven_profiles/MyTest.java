package maven_profiles;

import org.testng.annotations.Test;

public class MyTest {


	@Test(groups = { "regression" })
	public void myTest1() {

		System.out.println("my regression test 1");
	}

	@Test(groups = { "smoke" })
	public void myTest2() {

		System.out.println("my smoke test 1");
	}

}
