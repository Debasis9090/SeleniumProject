package automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumDemo {
	private WebDriver driver;
	public static void main(String[] args) 
	{
		SeleniumDemo sd=new SeleniumDemo();
		sd.search();
		sd.search1();
	}
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Man Of Gamer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void search()
	{
        driver.get("http:www.google.com");
        driver.findElement(By.name("q")).sendKeys("https://www.sramanujan.com/");
        driver.findElement(By.name("q")).submit();
        driver.findElement(By.className("LC20lb")).click();
	}
	@Test
	public void search1()
	{
        driver.get("http:www.google.com");
        driver.findElement(By.name("q")).sendKeys("https://www.sramanujan.com/");
        driver.findElement(By.name("q")).submit();
        driver.findElement(By.className("LC20lb")).click();
	}
	@After
	public void close()
	{
		driver.close();
	}
}
