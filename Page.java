package AcademyBugs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page extends ProjectBase{
	WebDriver driver ;
	
	@FindBy( className  = "ec_image_link_cover")WebElement shoes ;
	@FindBy(xpath = ("//input[@value='ADD TO CART']")) WebElement cart ;
	@FindBy(id = "ec_currency_conversion") WebElement currency ;
	
	
	public void yellowshoes() {
		shoes.click();
	}
	public void addtocart() {
		cart.click();
	}
	
    public void select() {
	new Select(currency).selectByValue("EUR");
}
    Page(WebDriver d){
    	driver=d;
    	PageFactory.initElements(d, this);
    }
}
