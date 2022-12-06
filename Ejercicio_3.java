package Programacion_II.Clase_11.Arreglos.Ejercicios;

import java.util.Scanner;

/**
 * Ingresar 5 numeros, mostrar la media de los positivos y negativos y mostrar la cantidad de ceros ingresados
 * @author Matias
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        int numeros []=new int[5];
        double sumaPositivos=0, sumaNegativos=0;
        int numero,cantidadPositivos=0, cantidadNegativos=0, cantidadCeros=0; 
        Scanner entrada=new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un nro:");    
            numero=entrada.nextInt();
            numeros[i]=numero;
            if(numero>0){
                sumaPositivos+=numero;
                cantidadPositivos++;
            }
            else{
                if(numero<0)
                {
                    sumaNegativos+=numero;
                    cantidadNegativos++;
                }
                else{
                    cantidadCeros++;
                }
            }                
        }
        
        if(cantidadPositivos>0)
            System.out.println("Promedio Positivos: "+ (sumaPositivos/cantidadPositivos));
        else
            System.out.println("Promedio Positivos: "+ 0);
        
        if(cantidadNegativos>0)
            System.out.println("Promedio Negativos: "+ (sumaNegativos/cantidadNegativos));
        else
            System.out.println("Promedio Negativos: "+ 0);
        
        System.out.println("Cantidad de Ceros: "+ cantidadCeros);
        
    }
    
}
