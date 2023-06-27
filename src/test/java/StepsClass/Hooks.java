package StepsClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void Prior() {
		System.out.println("Done first");
	}
	
	@After
	public void Later() {
		System.out.println("Done last");
	}
}
