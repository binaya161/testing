package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefination {

    WebDriver driver;

    @Given ("^user is already on Login Page$")
    public void user_is_already_on_Login_Page() throws  Throwable{
        WebDriverManager.chromedriver ().setup ();
        //System.setProperty ("webdriver.chrome.driver","C:\\BINAYA ABSTRACT FILE\\Drivers");
        driver = new ChromeDriver ();
        driver.get ("https://classic.crmpro.com/index.html");
    }
    @When ("^title of login page is Free CRM$")
    public void title_of_login_page_is_Free_CRM(){
        String title = driver.getTitle ();
        System.out.println (title);
        Assert.assertEquals ("CRM software for customer relationship management, sales, and support",title);
    }
    @Then("^user enters username and password$")
    public void user_enters_username_and_password() {
        driver.findElement ( By.name ("username")).sendKeys ("groupautomation");
        driver.findElement (By.name ("password")).sendKeys ("Test@12345");
    }
    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button()  {
        WebElement element = driver.findElement (By.xpath ("//input[@value='Login']"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript ("arguments[0].click();",element);
    }
    @Then("^user is on home page$")
    public void user_is_on_home_page() {
        String title = driver.getTitle ();
        System.out.println ("Home Page title::"+ title);
        Assert.assertEquals ( "CRMPRO",title );

    }

}
