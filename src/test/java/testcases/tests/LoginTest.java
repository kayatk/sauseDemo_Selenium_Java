package testcases.tests;

import org.testng.annotations.Test;
import testcases.page.LoginPage;

public class LoginTest extends LoginPage{


    @Test(dataProvider = "jsondata",priority = 1)
    public void validUserLogins(String arr) {
        String users[] =arr.split(",");
        enterUserName(users[0]);
        enterPassword(users[1]);
        clickLogin();

    }


    @Test(dataProvider = "jsondata",priority = 3)
    public void validateInvalidUserLogin(String arr){
        String users[] =arr.split(",");
        enterUserName(users[0]);
        enterPassword("wrong");
        clickLogin();
    }

    @Test(priority = 4)
    public void validateMandatoryErrorMessage(){
        enterUserName("");
        enterPassword("");
        clickLogin();
    }




 /*   @DataProvider(name="loggin_Credentials")
    public  Object[][] loginUsers(){
          return new Object[][]{
           // {"standard_user","secret_sauce"},
               {"locked_out_user","secret_sauce"},
             //    {"problem_user","secret_sauce"},
              //    {"performance_glitch_user","secret_sauce"},
              //   {"error_user","secret_sauce"},
              //  {"visual_user","secret_sauce"}
        };
    }*/


}
