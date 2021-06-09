package DemoSeleniumV2.steps;

import DemoSeleniumV2.config.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import DemoSeleniumV2.pageServices.LoginPageService;

public class LoginStep {

    private LoginPageService loginPageService;
    private DriverConfig driverConfig;

    public LoginStep(){
        driverConfig = new DriverConfig();
        //driverConfig.tiempodeEspera();
        loginPageService = new LoginPageService(driverConfig.webDriver());
    }

    @Given("^Ingresamos a la pagina del login$")
    public void empresa_owner_wants_to_sing_in() {
        System.out.println("Hola mundo");

        loginPageService.go("http://localhost:4200/login");
        loginPageService.writeUsername("jordan");
        loginPageService.writePassword("jordan");
            try {
                Thread.sleep(5000);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        loginPageService.clickBtnIniciarSesion();


/*
        Usuario usuario = new Usuario("Jordan", "Jordan");
        Usuario usuario2 = new Usuario("Jordan2", "Jordan2");
        Usuario usuario3= new Usuario("Jordan3", "Jordan3");
        Usuario usuario4 = new Usuario("Jordan4", "Jordan4");
        Usuario usuario5 = new Usuario("Jordan5", "Jordan5");

        List<Usuario> lista = new ArrayList<>();
        lista.add(usuario);
        lista.add(usuario2);
        lista.add(usuario3);
        lista.add(usuario4);
        lista.add(usuario5);
        */
    }

    @When("^The user send the required information to login$")
    public void the_user_send_the_required_information_to_login() {
        System.out.println("Hola mundo");
    }

    @Then("^He\\/She should go to other page$")
    public void he_she_should_go_to_other_page() {
        System.out.println("Hola mundo");
    }

}
