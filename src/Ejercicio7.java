
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author javie
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double num, sum = 0, max = Double.NEGATIVE_INFINITY, min
                = Double.POSITIVE_INFINITY;
        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextInt();
        int i = 1;
        do {
            System.out.print("Ingrese el numero " + i + ": ");
            num = sc.nextDouble();
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            i++;
        } while (i <= n);
        double promedio = sum / n;
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio);
        sc.close();
    }
}
