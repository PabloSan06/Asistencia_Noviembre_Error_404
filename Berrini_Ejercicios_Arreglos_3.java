/*
Ejercicio3: Leer 5 numeros por teclado, almacenarlos en un arreglo 
y a continuación realizar la media de los numeros positivos, 
la media de los negativos 
y contar el numero de ceros.
 */
package arreglos_ejercicios_3;

import java.util.Scanner;

public class Arreglos_Ejercicios_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[]= new float [5];
        float negativos=0, positivos=0, mediaNegativos, mediaPositivos;
        int conteoCeros=0, conteoNegativos=0, conteoPositivos=0;
        
        System.out.println("Guardamos los elementos del arreglo: ");
        for (int i=0; i<5; i++ ){
            System.out.println((i+1)+". Digite un numero: ");
            numeros[i]= entrada.nextFloat();
            if (numeros[i]>0){
                positivos += numeros[i];
                conteoPositivos++;
            }
            else if (numeros[i]<0){
                negativos+=numeros[i];
                conteoNegativos++;
            }
            else{
                conteoCeros++;
            }
            
        }
        
        if (conteoPositivos==0){
            System.out.println("\nNo se puede sacar la media de los numeros positivos");
        }
        else{
            mediaPositivos=positivos/conteoPositivos;
            System.out.println("La media de los positivos es: " + mediaPositivos);
        }
        
        if (conteoNegativos==0){
            System.out.println("\nNo se puede sacar la media de los numeros negativos");
        }
        else{
            mediaNegativos=negativos/conteoNegativos;
            System.out.println("La media de los positivos es: " + mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es: "+ conteoCeros);
        //Ingresar 2, -5, 6, -2, 0 
        
        
        
    }
    
}
