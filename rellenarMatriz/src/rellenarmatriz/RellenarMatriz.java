 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rellenarmatriz;
import java.util.Scanner;
 
 /*Llevar a cabo un programa que permite cargar completamnete con numeroa 5 una matriz de 4x5 (4 filas, 5 columnas)*/
 
public class RellenarMatriz {

    
    public static void main(String[] args) {
        
        int matriz [][] = new int /*filA*/[4] /*columna*/[5];
        
        //rellenamos con números 5
         for(int f=0; f<4; f++){
             for(int c=0; c<5; c++){
             matriz[f][c]  = 5;
                     }
         }
             for(int f=0; f<4; f++){
                 
             for(int c=0; c<5; c++){
             System.out.println(matriz[f][c]);
                     }
         }
    }
    
}
