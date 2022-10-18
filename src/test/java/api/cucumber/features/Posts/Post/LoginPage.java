package api.cucumber.features.Posts.Post;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

Webdriver driver = null;


public class LoginPage {
    @Given("browser is open")
    public void browser_is_open() {
       WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
    }

    @And("user is on login page")
    public void user_is__on_login_page(){
        driver.navigate().to("https://www.rightmove.co.uk");
    }



}
