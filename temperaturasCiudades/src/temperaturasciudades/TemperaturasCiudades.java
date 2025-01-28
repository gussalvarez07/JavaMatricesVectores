/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturasciudades;
import java.util.Scanner;
/*En tres vectores diferentes se guardan los nombres, temperaturas minimas y maximas de 5 ciudades, en el segundo las temperaturas
minimas alcanzadas y el tercero las temperatuas maximas alcanzadas en la ultima semana. Se necesitan un programa que permita la carga de las ciudades, 
sus tem minimas y maximas;ademas, deberá poder informar por pantalla cual fue la cuidad con la tem mas baja y cuak con la tem mas alta(dando a conocer al mismo
la cantidad de grados)
obera 16 29
posadas 18 32
L. N. Alem 15  28
*/

public class TemperaturasCiudades {

  
    public static void main(String[] args) {
        String ciudades [] = new String [5];
        Double minimas [] = new Double [5];
        Double maximas [] = new Double [5];
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        //cargar los vectores
        for(int i=0; i<ciudades.length; i++){
        System.out.println("Ingrese el nombre de la ciudad"+ i);
        ciudades[i] = teclado.next();
        System.out.println("Ingrese la minima de la ciudad" + i);
        minimas[i] = teclado2.nextDouble();
        
        System.out.println("Ingrese la maxima de la ciudad" + i);
        maximas[i] = teclado2.nextDouble();
        
        }
        Double minima = 999999.00;
        int posMin = -1;
        //determinamos la minima
        for(int i =0; i<ciudades.length; i++){
            
            if(minimas[i]<minima){
                minima = minimas[i];
                posMin=i;
            }
            
            
        }
        
        Double maxima = -999999.00;
        int posMax = -1;
        //determinamos la minima
        for(int i =0; i<maximas.length; i++){
            
            if(maximas[i]>maxima){
              // maxima = maxima[i];
               maxima = maxima[i];
                posMax=i;
            }
  
    }
        System.out.println("La temperatura minima es de " + minima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
        System.out.println("La temperatura maxima es de: " + maxima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);
    
}}
