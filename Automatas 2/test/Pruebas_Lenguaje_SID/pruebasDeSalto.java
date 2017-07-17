package Pruebas_Lenguaje_SID;

/**
 *
 * @author erick
 */
import java.util.Scanner;

public class pruebasDeSalto {

    public static void main(String[] args) {

        String cadena = "La cadena \n de \ntexto es esta";

        System.out.println("Mirando la cadena:\n" + cadena);

        char cadena2[] = cadena.toCharArray();

        int contador = 0, saltos = 0;
        String valorReservado = "";
        
        while (contador < cadena2.length) {
            if (' ' == cadena2[contador]) {
                if (cadena2[contador + 1] == 'n') {
                    saltos++;
                    contador++;
                }
            }
            contador++;
        }

        System.out.println("Los saltos totales son: " + saltos);
    }

}
