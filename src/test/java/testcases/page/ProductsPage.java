package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsPage extends TestBase {

    WebElement menu;
    WebElement logOut;

    public  void clickMenu(){
        menu=driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
    }

    public  void clickLogout(){
        logOut = driver.findElement(By.id("logout_sidebar_link"));
        logOut.click();
    }
}
