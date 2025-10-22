package tp3ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TP3Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listaTareas = new ArrayList<String>();
        //agregar atreas
        while (true) {
            System.out.println("Ingresar tarea, o ingrese 'fin' para continuar");
            String tarea = teclado.nextLine();
            if (tarea.equalsIgnoreCase("fin")) {
                break;
            } else {
                System.out.println("En que posicion desea agregar la tarea? ");
                int n = teclado.nextInt();
                teclado.nextLine();     //limpiar buffer
                listaTareas.add(n, tarea);
            }
        }
        //eliminar tareas
        while (true) {
            System.out.println("\nSi desea eliminar una tarea, vuelva a escribirla.");
            System.out.println("O si desea proseguir escriba 'fin'");
            String eliminar = teclado.nextLine();
            if (eliminar.equalsIgnoreCase("fin")) {
                break;
            } else {
                for (int i = listaTareas.size() - 1; i >= 0; i--) {
                    if (listaTareas.get(i).equalsIgnoreCase(eliminar)) {
                        listaTareas.remove(i);
                    }
                }
            }
        }
        //mostrar tareas
        System.out.println("\nLas tareas pendientes son: ");
        Collections.sort(listaTareas);
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println(listaTareas.get(i));
        }
    }
}
