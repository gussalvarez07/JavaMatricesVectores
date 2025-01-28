/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recorridocarganombres;
import java.util.Scanner;
//Levar a cabo un programa que incluya un vector que alamcene los nombres: Alejandra
/*Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa, y Ludmila. Realizar un recorrido del vector para cargar
los datos y otro recorrido para mostrar los mismos por pantalla. */

public class RecorridoCargaNombres {

    
    public static void main(String[] args) {
        //vector que guarde 8 nombres.
        String vector [] = new String [8];
        //cargar manual
        vector [0] = "Alejandra";
        vector [1]="Leonardo";
        vector [2]="Rosa";
        vector [3]="Guillermo";
        vector [4]="Gabriel";
        vector [5]="Daniel";
        vector [6]="Luisa";
        vector [7]="Ludmila";
        
        //recorrido
        
        for(int f=0; f<vector.length; f++){
            System.out.println("En la posicion: " + i + "Esta el nombre " + vector[f]);
        
        }
    }
    
}
