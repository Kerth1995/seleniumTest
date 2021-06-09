package DemoSeleniumV2.pageServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import DemoSeleniumV2.page.LoginPage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class LoginPageService {

    private WebDriver webDriver;
    private LoginPage loginPage;

    public LoginPageService(WebDriver driver){
        this.webDriver = driver;
        this.loginPage = new LoginPage(driver);
    }

    public void go(String url){
        this.webDriver.get(url);
    }

    public void writeUsername(String userNameText){
        WebElement user = this.loginPage.getUsername();
        user.clear();
        user.sendKeys(userNameText);
    }

    public void writePassword(String passwordText){
        WebElement pass = this.loginPage.getPassword();
        pass.clear();
        pass.sendKeys(passwordText);
    }

    public void clickBtnIniciarSesion(){
        WebElement btn = this.loginPage.getBtnIniciarSesion();
        btn.click();
    }
}
