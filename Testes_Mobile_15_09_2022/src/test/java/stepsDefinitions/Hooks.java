package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

public class Hooks {
	
	Utils acessar = new Utils();
	
	@Before
	public void acessarApp() throws Exception  {
		acessar.acessarApp();
	}
	@After
	public void fecharApp() {
		
	}
	
	

}
