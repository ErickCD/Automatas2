/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas_Lenguaje_SID;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class testComprobaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        boolean band = true, condicion;
        do {
            System.out.println("numero: ");
            valor = entrada.nextInt();
            System.out.println("band: ");
            band = entrada.nextBoolean();
            System.out.println("condicion: ");
            condicion = entrada.nextBoolean();

            ejecuta(band, valor);
        } while (condicion);
    }

    private static void ejecuta(boolean band, int valor) {

        if (valor != 0) {
            if (band == true || valor > 18) {
                System.out.println("entro con: band = " + band + ", valor = " + valor);
            }else{
                System.out.println("no entra");
            }
        }
    }
}
