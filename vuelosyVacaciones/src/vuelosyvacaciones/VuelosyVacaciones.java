/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuelosyvacaciones;
import java.util.Scanner; 

import java.util.Scanner;

public class VuelosyVacaciones {

    public static void main(String[] args) { 
        
        // Creamos la matriz
        int vuelos[][] = new int[6][3];

        // Cargamos la matriz 
        Scanner teclado = new Scanner(System.in);
        
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " Horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }
        
        // Venta de asientos 
        String bandera = "";
        int destino, horario, asientos;
        
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el n° de destino (0 a 5):");
            destino = teclado.nextInt();

            if (destino < 0 || destino > 5) {
                System.out.println("Destino no existente. Ingrese un número entre 0 y 5.");
                continue;  // Vuelve a pedir datos sin continuar con el resto del código
            }

            System.out.println("Ingrese el horario de vuelo (0 a 2):");
            horario = teclado.nextInt();
            
            if (horario < 0 || horario > 2) {
                System.out.println("Horario no existente. Ingrese un número entre 0 y 2.");
                continue;
            }

            System.out.println("Ingrese la cantidad de asientos:");
            asientos = teclado.nextInt();

            if (vuelos[destino][horario] >= asientos) {
                System.out.println("Su reserva fue realizada con éxito.");
                vuelos[destino][horario] -= asientos;
            } else {
                System.out.println("No hay suficientes asientos disponibles.");
            }

            System.out.println("Desea continuar reservando? Ingrese 'finish' para terminar o cualquier otra tecla para seguir:");
            bandera = teclado.next();
        }

        teclado.close(); // Cerramos el Scanner
        System.out.println("Gracias por usar el sistema de reservas.");
    }
}
