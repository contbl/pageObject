package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	  private final WebDriver driver;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public boolean isDashboardDisplayed() {
	        return driver.findElement(By.xpath("//div [@role='alert']")).isDisplayed();
	    }
	    
	    public void clickInContas() {
	    	driver.findElement(By.xpath("//a[contains(text(),'Contas')]")).click();  	
	    }
	    
	    public void clickInAdicionar() {
	    	driver.findElement(By.xpath("//a[contains(text(),'Adicionar')]")).click();  	
	    }
}
