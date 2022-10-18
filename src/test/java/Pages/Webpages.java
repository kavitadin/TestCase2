package Pages;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webpages {

    private WebDriver driver;

    private By txt_username = By.id

            public loginPage(WebDriver driver);
    this driver = driver;
    if(!driver.getTitle().equals("TestProject Demo")){
        throw new IllegalStateException("This is not login Page. The Current page is "+ driver.getCurrentUrl());
    }

}
public void enterUsername(String username)
    driver.findElement(txt_username).sendkeys(Username);
            }
