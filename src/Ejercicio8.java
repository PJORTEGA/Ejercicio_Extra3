
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author javie
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cantidadNumeros = 0, cantidadPares = 0,
                cantidadImpares = 0;
        while (true) {
            System.out.print("Ingrese un número entero: ");
            numero = sc.nextInt();
            if (numero % 5 == 0) {
                break;
            }
            if (numero < 0) {
                continue;
            }
            cantidadNumeros++;
            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }
        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: "
                + cantidadPares);
        String Impares = null;
        System.out.println("Cantidad de números impares: " + Impares);

    }

}
