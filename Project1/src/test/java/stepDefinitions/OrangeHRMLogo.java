package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogo {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        driver=new ChromeDriver();
    }
    @When("I open OrangeHRM home Page")
    public void i_open_orange_hrm_home_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Then("I Verify logo present on page")
    public void i_verify_logo_present_on_page() {
      boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true, status);
    }
   /* @And("Close chrome browser")
    public void close_chrome_browser() {
        driver.quit();*/
    }
}
