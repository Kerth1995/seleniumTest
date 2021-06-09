package DemoSeleniumV2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class DemoSeleniumV2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSeleniumV2Application.class, args);
		System.out.println("Hola Raul");
	}

	public String demo(String value){
		return value;
	}

}
