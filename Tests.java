package AcademyBugs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests  extends ProjectBase{
	
	@Test
	public void Academy() {
		
		Page pa = new Page(driver);
		 
		pa.yellowshoes();
		pa.addtocart();
		pa.select();
		
	}

	@BeforeTest
	public void setp() throws Exception {
		setup();
	}
	@AfterTest
	public void qit() throws Exception {
		quit();
	}
}
