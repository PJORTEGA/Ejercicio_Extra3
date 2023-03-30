
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author javie
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI",
            "VII", "VIII", "IX"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX",
            "LXX", "LXXX", "XC"};
        System.out.println("Ingrese un número entre 1 y 10:");
        numero = sc.nextInt();
        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido");
        } else {
            int unidad = numero % 10;
            int decena = numero / 10;
            System.out.println("El número " + numero + " en romano es: " + decenas[decena] + unidades[unidad]);
        }
        sc.close();
    }
}
