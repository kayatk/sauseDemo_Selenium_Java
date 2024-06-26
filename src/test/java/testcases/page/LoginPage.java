package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends TestBase {

    WebElement userName_txtBx;
    WebElement password_txtBx;
    WebElement loginBtn;
    WebElement pwdErrormsge;
    WebElement userNameErrormsge,loginTitle;

    public void enterUserName(String username){
       userName_txtBx=driver.findElement(By.id("user-name"));
       if(userName_txtBx.isDisplayed()) {
          userName_txtBx.sendKeys(username);
      }
   }

   public void enterPassword(String password){
        password_txtBx =driver.findElement(By.id("password"));
       if(password_txtBx.isDisplayed()) {
            password_txtBx.sendKeys(password);
        }
    }

    public void clickLogin(){
       loginBtn = driver.findElement(By.id("login-button"));
      if(loginBtn.isDisplayed()){
          loginBtn.click();
      }
    }
    public void clearUsername()
    {
       // System.out.println(userName_txtBx);
        userName_txtBx.clear();
    }
     public void verifyErrorMessage(){
        pwdErrormsge = driver.findElement(By.cssSelector("h3"));
        //driver.findElement(By.xpath("//h3[contains(text(),'Password')]"));
        pwdErrormsge.isDisplayed();
     }

     public void verifyLoginPage(){
        loginTitle=driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]"));
        loginTitle.isDisplayed();
     }

}
