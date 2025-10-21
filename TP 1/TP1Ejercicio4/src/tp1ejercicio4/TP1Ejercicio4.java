package tp1ejercicio4;

import java.util.Scanner;

class Camion {
    String patente;
    String chofer;
    String tipoCarga;
    String horaEgreso;

    public Camion(String patente, String chofer, String tipoCarga, String horaEgreso) {
        this.patente = patente;
        this.chofer = chofer;
        this.tipoCarga = tipoCarga;
        this.horaEgreso = horaEgreso;
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Chofer: " + chofer);
        System.out.println("Tipo de carga: " + tipoCarga);
        System.out.println("Hora de egreso: " + horaEgreso);
        System.out.println("----------------------------");
    }
}

public class TP1Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_CAMIONES = 30;
        //final int TOTAL_CAMIONES = 3;
        Camion[] camiones = new Camion[TOTAL_CAMIONES];
        int contadorTe = 0;

        for (int i = 0; i < TOTAL_CAMIONES; i++) {
            System.out.print("Ingrese la patente: ");
            String patente = scanner.nextLine();

            System.out.print("Ingrese nombre y apellido del chofer: ");
            String chofer = scanner.nextLine();

            System.out.print("Ingrese el tipo de carga: ");
            String tipoCarga = scanner.nextLine();

            System.out.print("Ingrese la hora de egreso (formato HH:MM): ");
            String horaEgreso = scanner.nextLine();

            // Crear objeto Camion y guardarlo en el arreglo
            camiones[i] = new Camion(patente, chofer, tipoCarga, horaEgreso);

            if (tipoCarga.equalsIgnoreCase("te") || tipoCarga.equalsIgnoreCase("té")) {
                contadorTe++;
            }
            System.out.println();
        }

        System.out.println("\n=== Datos de los camiones ===");
        for (Camion c : camiones) {
            c.mostrarDatos();
        }

        System.out.println("Cantidad de camiones que transportaron te: " + contadorTe);
    }
}
