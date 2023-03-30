
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author javie
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = sc.nextInt();
        int dias = minutos / 1440; // 1440 minutos en un día
        int horas = (minutos % 1440) / 60; // 60 minutos en una hora
        System.out.println(minutos + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s).");
        sc.close();
    }
}
