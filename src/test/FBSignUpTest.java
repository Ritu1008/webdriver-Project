package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement signUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUp.click();
		

		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		fName.sendKeys("John");
		lName.sendKeys("White");
		mobile.sendKeys("99999999999");
		password.sendKeys("Anc@1234");
		
		WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("The default day is " + selectedDay.getText());
		
		WebElement selectedMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
		System.out.println("The default month is " + selectedMonth.getText());

		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select mmMonth = new Select(month);
		mmMonth.selectByVisibleText("Jan");
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("2000");
		
		List<WebElement> list=driver.findElements(By.xpath("//select[@title='Month']/option"));
		for(WebElement Month:list) {
			System.out.println(Month.getText());
		}
			
			WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
			Female.click();
			
			String Gender = "Female";
			
			String genderXpath = "//label[text()='placeholder']";
			String newXpath = genderXpath.replace("placeholder",Gender);
			System.out.println("New Xpath is " + newXpath);
			
			WebElement genderElem = driver.findElement(By.xpath(newXpath));
			genderElem.click();
			
		

			
		}
		
			
		
	}


