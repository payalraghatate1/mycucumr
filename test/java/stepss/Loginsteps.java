package stepss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Loginsteps {
	public WebDriver driver;
	@When ("^user opens \"(.*)\" browser$")
    public void openBrowser(String browsernm)
    {
    	System.out.println("Chrome browser"+browsernm);
    	System.setProperty("webdriver.chrome.driver", "E:\\selenim jar\\New Chrome driver\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    }
    @And ("^user enters application url \"(.*)\"$")

    public void enterapplicationurl(String url)
	{
    	System.out.println(url+"url");
		driver.get(url);
	}
    
    @And ("^user waits \"(.*)\" seconds to login page to be loaded$")

    public void waittillPageLoaded(int timeseconds)
	{
		driver.manage().timeouts().pageLoadTimeout(timeseconds, TimeUnit.SECONDS);
		
	}
    @And ("^user maximizes chrome browser$")

    public void maximizeBrowser()
	{
driver.manage().window().maximize();
	}
    @Then ("^user is on login page$")

    public void verifyLoginpage()
	{
		String exp_title="Welcome: Mercury Tours";
		String act_title=driver.getTitle();
		Assert.assertEquals(exp_title, act_title);
		System.out.println("The title of login page is:"+act_title);
	}
    @Given ("^user access login page$") 
    public void verifyloginimg()
	{
		boolean act_flag=driver.findElement(By.xpath("//img[@src='/images/featured_destination.gif']")).isDisplayed();
		if(act_flag==true)
		{
			System.out.println("Login image is displayed");
		}
		}
	    @When ("^user enters \"(.*)\" as username$")

		public void enterUsername(String username)
		
		{
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
			
		}
	    @And ("^user enteres \"(.*)\" as password$")

	    public void enterPassword(String password)
		{
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		}
	    @And ("^user clicks on Sign in button$")

	    public void clickonSignin()
		{
		   driver.findElement(By.xpath("//input[@name='login']")).click();
		}
	    @Then ("^user is on Flight Finder page$")

	    public void verifyFlightfinder()
		{
		  boolean act_flag1= driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
		  boolean exp_flag1=true;
		  Assert.assertEquals(exp_flag1, act_flag1);
		  
		}
	    @When ("^user clicks on signoff button$")

	    public void clickonSignoff()
		{
		driver.findElement(By.linkText("SIGN-OFF")).click();
		}
	    @Then ("^user is on Sign on page$")

	    public void verifySignonpage()
		{
			boolean act_flag3=driver.findElement(By.xpath("//img[@src='/images/masts/mast_signon.gif']")).isDisplayed();
			if(act_flag3==true)
			{
				System.out.println("User is on Sign on page");
			}


	    
	}
}



