package org.example;

import java.util.Scanner;

public class Fiesta_Aburrida {
    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Entrada de la cantidad de gente
        System.out.println("Introduce la cantidad de nombres: ");
        int cantidad = entrada.nextInt();

        //Creo un vector para guardar los nombres
        String nombres[] = new String[cantidad];
        entrada.nextLine();

        //Entrada de los nombres
        for (int i = 0; i < cantidad; i++) {
            System.out.println(i);
            nombres[i] =  entrada.nextLine() ;
        }

        //Mensaje con el hola y el nombre
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Hola " + nombres[i].substring(4));

        }


    }
}
