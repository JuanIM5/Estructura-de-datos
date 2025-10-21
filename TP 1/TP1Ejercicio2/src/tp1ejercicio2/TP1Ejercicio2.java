package tp1ejercicio2;
import java.util.Scanner;

public class TP1Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas: ");
        int n = scanner.nextInt();
        
        int[] notas = new int[n];
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas[i] = (int) nota;
        if (nota >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

        scanner.close();
    }
    
}
