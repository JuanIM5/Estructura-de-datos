package tp3ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class TP3Ejercicio3 {

    public static void main(String[] args) {
        int mayor = 0;
        int menor = 2147483647;
        double promedio = 0;
        int contador = 0;

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> Numeros = new ArrayList<Integer>();
        Set<Integer> seen = new HashSet<>();

        while (true) {
            System.out.println("Ingrese un numero entero positivo, o un negativo para finalizar: ");
            int numero = teclado.nextInt();
            if (numero < 0) {
                break;
            } else {
                Numeros.add(numero);
                teclado.nextLine();
                promedio = promedio + numero;
                contador++;
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        System.out.println("El numero mas grande es: " + mayor);
        System.out.println("El menor numero es: " + menor);
        System.out.println("El promedio es: " + promedio / contador);

        for (int i = Numeros.size() - 1; i >= 0; i--) {
            if (!seen.add(Numeros.get(i))) {
                Numeros.remove(i);
            }
        }
        System.out.println("Los numeros en la lista son: " + Numeros);
    }
}
