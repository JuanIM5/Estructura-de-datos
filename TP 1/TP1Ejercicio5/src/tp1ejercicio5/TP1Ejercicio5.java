package tp1ejercicio5;

import java.util.Scanner;

public class TP1Ejercicio5 {

    public static void main(String[] args) {

        int servicio = 0;

        int matriz[][] = new int[5][3];

        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 5; f++) {
            System.out.println("Ingrese el DNI del cliente");
            matriz[f][0] = teclado.nextInt();
            System.out.println("Ingrese el numero del servicio");
            matriz[f][1] = teclado.nextInt();
            servicio = matriz[f][1];
            switch (servicio) {
                case 1: matriz[f][2] = 750;
                break;
                case 2: matriz[f][2] = 1100;
                break;
                case 3: matriz[f][2] = 1425;
                break;
            }
            System.out.println("-----------------------------------");
        }

        for (int f = 0; f < 5; f++) {
            System.out.println("");
            System.out.println("El DNI del cliente es: " + matriz[f][0]);
            System.out.println("Su numero de servicio es " + matriz[f][1]);
            System.out.println("Y el monto a pagar es de " + matriz[f][2]);
            System.out.println("-----------------------------------");
        }
    }

}
