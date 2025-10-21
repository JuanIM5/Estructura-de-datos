package tp1.ejercicio1;
import java.util.Scanner;

public class TP1Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int tamaño = scanner.nextInt();
        
        double[] notas;
        double notaAlta = 0;
        double promedio = 0;
        
        notas = new double[tamaño];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese las notas: ");//coma
            notas[i] = scanner.nextDouble();
            promedio = promedio + notas[i];
            if (notas[i]>notaAlta){
                notaAlta = notas[i];
            }
        }
        
        promedio = promedio / tamaño;  
        for (int i=0; i<notas.length; i++){
            System.out.println("Las notas son: " + notas[i]);
        }
        System.out.println("La nota mas alta es: " + notaAlta);
        System.out.println("El promedio es: " + promedio);
        
        }
    }
