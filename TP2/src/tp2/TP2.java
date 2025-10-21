package tp2;

import java.util.Scanner;

public class TP2 {

    static final int FILAS = 10;
    static final int COLUMNAS = 10;
    static String[][] sala = new String[FILAS][COLUMNAS];
    static boolean[][] asientosReservados = new boolean[FILAS][COLUMNAS];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarSala();
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 ->
                    realizarReserva();
                case 2 ->
                    eliminarReserva();
                case 3 ->
                    mostrarSala();
                case 4 -> {
                    System.out.println("Saliendo del sistema...");
                    return;
                }
                default ->
                    System.out.println("Opcion no valida.");
            }
        }
    }

    private static void inicializarSala() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sala[i][j] = "Disponible";
                asientosReservados[i][j] = false;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Realizar Reserva");
        System.out.println("2. Eliminar Reserva");
        System.out.println("3. Mostrar Sala");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void realizarReserva() {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su telefono: ");
        String telefono = scanner.nextLine();
        System.out.print("Fila (1-10): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Columna (1-10): ");
        int columna = scanner.nextInt() - 1;

        if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
            System.out.println("Asiento  no valido.");
            return;
        }

        if (asientosReservados[fila][columna]) {
            System.out.println("Este asiento ya esta reservado por: " + sala[fila][columna]);
        } else {
            asientosReservados[fila][columna] = true;
            sala[fila][columna] = nombre + " (" + telefono + ")";
            System.out.println("Reserva realizada con éxito.");
        }
    }

    private static void eliminarReserva() {
        System.out.print("Fila (1-10): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Columna (1-10): ");
        int columna = scanner.nextInt() - 1;

        if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
            System.out.println("Asiento no valido.");
            return;
        }

        if (!asientosReservados[fila][columna]) {
            System.out.println("Este asiento no esta reservado.");
        } else {
            asientosReservados[fila][columna] = false;
            sala[fila][columna] = "Disponible";
            System.out.println("Reserva eliminada con exito.");
        }
    }

    private static void mostrarSala() {
        System.out.println("\n----- MAPA DE LA SALA -----");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(asientosReservados[i][j] ? "[X] " : "[ ] ");
            }
            System.out.println();
        }
    }
}
