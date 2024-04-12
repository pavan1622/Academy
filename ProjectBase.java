package AcademyBugs;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class ProjectBase extends BaseTest {
	
		boolean result = false;
		public boolean Waitforvisable(By location) {
			try {
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(location));
				 return result;
			}
			catch (Exception e) {
				System.out.println("unable to find element" + location);
				e.printStackTrace();
			}
			return result;
		}
		public void waitforAlerrtpresent() {
			try {
				wait.until(ExpectedConditions.alertIsPresent());
			}catch (Exception e) {
				System.out.println("unable to switch to Alert");
				e.printStackTrace();
			}
			
		}

	}


