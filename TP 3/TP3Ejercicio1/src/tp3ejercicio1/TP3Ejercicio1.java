package tp3ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;

class Estudiantes {

    String nombre;
    int edad;
    double nota;

    public Estudiantes(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + ", Edad: " + edad + ", Nota: " + nota;
    }
}

public class TP3Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Estudiantes> lista;
        lista = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el nombre del alumno, o 'fin' para finalizar: ");
            String nombre = teclado.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese la edad del alumno: ");
            int edad = teclado.nextInt();

            System.out.println("Ingrese la nota del alumno: ");
            double nota = teclado.nextDouble();
            teclado.nextLine();

            Estudiantes estudiante = new Estudiantes(nombre, edad, nota);
            lista.add(estudiante);
        }

        System.out.println("\nLos alumnos con notas mayores a 7 son: ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).nota > 7) {
                System.out.println(lista.get(i));
            }
        }

        for (int i = lista.size() - 1; i >= 0; i--) {
            if (lista.get(i).nota < 4) {
                lista.remove(i);
            }
        }

        System.out.println("\nLista de alumnos: ");
        for (Estudiantes est : lista) {
            System.out.println(est);
        }
    }
}
