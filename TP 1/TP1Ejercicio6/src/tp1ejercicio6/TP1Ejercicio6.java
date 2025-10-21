package tp1ejercicio6;

import java.util.Scanner;

public class TP1Ejercicio6 {

    public static void main(String[] args) {

        int mejorAuto = 2147483647;
        int mejorTiempo = 2147483647;
        int auto = 0;
        int tiempo = 0;

        int matriz[][] = new int[12][2];

        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 12; f++) {
            System.out.println("Ingrese el numero del vehiculo");
            matriz[f][0] = teclado.nextInt();
            auto = matriz[f][0];
            
            System.out.println("Ingrese el tiempo (en segundos)");
            matriz[f][1] = teclado.nextInt();
            tiempo = matriz[f][1];
            
            System.out.println("");
            
            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorAuto = auto;
            }
        }

        System.out.println("El vehiculo con mejor tiempo fue el numero " + mejorAuto + " en " + mejorTiempo + " segundos");

    }

}
