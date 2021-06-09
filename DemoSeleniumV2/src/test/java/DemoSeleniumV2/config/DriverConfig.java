package DemoSeleniumV2.config;


import DemoSeleniumV2.utils.BrowserWeb;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.Duration;

//@PropertySource("classpath:application.properties")
public class DriverConfig {

    private String browser = "firefox";

    private long webDriverWaitTimeOut;

    public WebDriver webDriver(){
        //System.setProperty("webdriver.chrome.driver" "D:/EMPRESA/PROYECTOS/DemoSeleniumV2/src/test/resources/drivers/windows/chromedriver_91.exe");

        //WebDriver webDriver = new ChromeDriver();
        //webDriver.manage().window().maximize();
        return driverFactory(browser);
    }

    public static WebDriver driverFactory(String browserWeb){

        WebDriver navegador = null;

        if (BrowserWeb.chrome.toString() == browserWeb){
            System.setProperty("webdriver.chrome.driver"
                    ,"D:/EMPRESA/PROYECTOS/DemoSeleniumV2/src/test/resources/drivers/windows/chromedriver_91.exe");
            navegador = new ChromeDriver();
            navegador.manage().window().maximize();
        }else if (BrowserWeb.firefox.toString() == browserWeb){
            System.setProperty("webdriver.gecko.driver"
                    ,"D:/EMPRESA/PROYECTOS/DemoSeleniumV2/src/test/resources/drivers/windows/geckodriver.exe");
            navegador = new FirefoxDriver();
            navegador.manage().window().maximize();
        }
        /*
        else if (BrowserWeb.edge.toString() == browserWeb){
            System.setProperty("webdriver.chrome.driver"
                    ,"D:/EMPRESA/PROYECTOS/DemoSeleniumV2/src/test/resources/drivers/windows/geckodriver.exe");
            navegador = new EdgeDriver();
            navegador.manage().window().maximize();
        }else if (BrowserWeb.ie.toString() == browserWeb){
            System.setProperty("webdriver.chrome.driver"
                    ,"D:/EMPRESA/PROYECTOS/DemoSeleniumV2/src/test/resources/drivers/windows/geckodriver.exe");
            navegador = new InternetExplorerDriver();
            navegador.manage().window().maximize();
        }
        */
        else{
            throw new IllegalArgumentException("Driver no encontrado para el navegador " + browserWeb);
        }

        return navegador;
    }

    public WebDriverWait tiempodeEspera(){
        return new WebDriverWait(webDriver(), webDriverWaitTimeOut);
    }
}
