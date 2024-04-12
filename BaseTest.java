package AcademyBugs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	Properties prop ;
	File file ;
	FileInputStream fi ;
	
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	
	public void setup() throws Exception {
		prop = new Properties();
		file = new File("C:\\Users\\pavan\\eclipse-workspace\\TestMavenProject\\src\\test\\java\\config\\Project.Properties");
		try {
			fi = new FileInputStream(file);
			prop.load(fi);
			
		}catch (FileNotFoundException e) {
			System.out.println("file not show in the given path");
			e.printStackTrace();
			
		}
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		action =  new Actions(driver);	
		
	}
	public void quit() throws Exception {
		driver.quit();
		fi.close();
	}

}
