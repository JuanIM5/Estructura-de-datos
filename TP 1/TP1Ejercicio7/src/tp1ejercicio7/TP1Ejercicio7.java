package tp1ejercicio7;

import java.util.Scanner;

class Datos {
    int dni;
    int edad;
    String sexo;
}

public class TP1Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int total = 0;
        int varones = 0;
        int varones2 = 0;
        int mujeres = 0;

        int maxEdad = 0;
        Datos personaMayorEdad = null;

        while (true) {
            System.out.println("Ingrese el numero de documento (o '0' para finalizar):");
            int dni = teclado.nextInt();

            if (dni == 0) {
                break;
            }

            System.out.println("Ingrese la edad:");
            int edad = teclado.nextInt();

            System.out.println("Ingrese el sexo ('M' o 'F'):");
            String sexo = teclado.next();

            Datos persona = new Datos();
            persona.dni = dni;
            persona.edad = edad;
            persona.sexo = sexo;

            if (edad > maxEdad) {
                maxEdad = edad;
                personaMayorEdad = persona;
            }

            total++;

            if (sexo.equalsIgnoreCase("M")) {
                varones++;
                if (edad >= 16 && edad <= 65) {
                    varones2++;
                }
            } else if (sexo.equalsIgnoreCase("F")) {
                mujeres++;
            }
        }

        double porcentaje = 0;
        if (varones > 0) {
            porcentaje = (double) varones2 / varones * 100;
        }

        System.out.println("\nResultados del censo:");
        System.out.println("Total de personas censadas: " + total);
        System.out.println("Cantidad de varones: " + varones);
        System.out.println("Cantidad de mujeres: " + mujeres);
        System.out.println("Porcentaje de varones entre 16 y 65: " + porcentaje + "%");

        if (personaMayorEdad != null) {
            System.out.println("La persona con mayor edad es:");
            System.out.println("DNI: " + personaMayorEdad.dni);
            System.out.println("Edad: " + personaMayorEdad.edad);
            System.out.println("Sexo: " + personaMayorEdad.sexo);
        }
    }
}
