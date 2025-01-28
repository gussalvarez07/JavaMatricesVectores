/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package num3;
import java.util.Scanner;
//Realizar un programa que permita cargar 15 numeros en un vector. Una vez cargados, se necesita que 
//el programa cuente e informe por pantalla cuantas veces se cargo el numero 3 


public class Num3 {

    
    public static void main(String[] args) {
        int vector [] = new int[15];
        
        Scanner teclado = new Scanner (System.in);
            //Cargar datos 
            for (int i = 0; i<15; i++){
              System.out.println("Ingrese un numero para el vector");
              vector [i] = teclado.nextInt();
              
              }
            int cont = 0;
             for(int i =0; i<15; i++){
                  if(vector[i] == 3){
                      cont = cont + 1;
                  }
                 }
       System.out.println("La cantidad de numeris 3 que hay en el vector es: " + cont);
    }
   
}