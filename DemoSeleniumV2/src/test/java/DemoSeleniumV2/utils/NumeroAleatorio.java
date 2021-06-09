package DemoSeleniumV2.utils;

import java.util.Random;

public class NumeroAleatorio {

    public static  String get(){
        String primerNumero = numeroAleatorio(11111111, 99999999);
        String segundoNumero = numeroAleatorio(11111111, 99999999);
        return String.format("%s%s", primerNumero, segundoNumero);
    }

    private static String numeroAleatorio(int valorMinimo, int valorMaximo){
        Random random = new Random();
        return String.valueOf(random.nextInt(((valorMaximo-valorMinimo)+1)+valorMinimo));
    }
}
