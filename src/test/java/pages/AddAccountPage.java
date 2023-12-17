package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAccountPage {
	private final WebDriver driver;

    public AddAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void setName() {
    	driver.findElement(By.id("nome")).sendKeys("rafilskoliveira654");
    }
    
    public void clickInSave() {
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    }
    
    public boolean isDashboardDisplayed() {
        return driver.findElement(By.xpath("//div[contains(text(),'Conta adicionada com sucesso!')]")).isDisplayed();
    }
  
}
