package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Teste {

	public static void main(String[] args) {
		char aspas = '"';
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "apk.exe");
		driver = new ChromeDriver();		
		Actions action = new Actions(driver);
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.name("email")).sendKeys("alexandrematos47@hotmail.com");
		driver.findElement(By.name("pass")).sendKeys("myloveistrue");
		driver.findElement(By.name("pass")).submit();
		driver.get("https://www.facebook.com/100008725068477");
		System.out.println(driver.findElement(By.id("u_0_2j")).getText());
		driver.get("https://www.facebook.com/messages/t/100008725068477");
		action.sendKeys("Olá lucas!").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}

}
