package DemoSeleniumV2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import DemoSeleniumV2.paths.LoginPath;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = LoginPath.PATH_NOMBRE_USUARIO)
    private WebElement username;

    @FindBy(xpath = LoginPath.PATH_PSW_USUARIO)
    private WebElement  password;

    @FindBy(xpath = LoginPath.PATH_BTN_INICIAAR_SESION)
    private WebElement btnIniciarSesion;

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

}
