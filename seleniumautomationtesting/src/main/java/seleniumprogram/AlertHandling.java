package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseClass {
	public void alert1()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe.click();
		driver.switchTo().alert().accept();
	}
	public void alert2()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe1.click();
		//System.out.println(clickMe1.isDisplayed());
		driver.switchTo().alert().dismiss();
		
	}
	public void alert3()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe2=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickMe2.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		AlertHandling alertHand=new AlertHandling();
		alertHand.browserInitialisation();
		alertHand.alert1();
		alertHand.alert2();
		alertHand.alert3();
		// TODO Auto-generated method stub

	}

}
