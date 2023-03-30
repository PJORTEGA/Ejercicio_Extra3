
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        char letra = input.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' 
|| letra == 'u') {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
    }
}
        
     
    
    

