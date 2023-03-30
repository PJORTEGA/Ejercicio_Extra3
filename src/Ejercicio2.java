/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 5, B = 10, C = 15, D = 20;
        System.out.println("Valores iniciales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Valores finales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        
    }
}
        
         
    

