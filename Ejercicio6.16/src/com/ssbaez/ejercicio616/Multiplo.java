package com.ssbaez.ejercicio616;

import java.util.Scanner;

public class Multiplo {
	
public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Aplicacion que determina si el segundo número de un par de enteros es múltiplo del primero");
        System.out.printf("Ingrese el primer entero %n%s",
                          "----> ");
        int num1 = input.nextInt();
        System.out.printf("Ingrese el segundo entero %n%s",
                          "----> ");
        int num2 = input.nextInt();
        esMultiplo(num1, num2);
        
    }
    
    public static int esMultiplo(int num1, int num2){
        
        int multiplo = num1 % num2;
        
        if(multiplo == 0)
            System.out.printf("%n%d es multiplo de %d%n", num2, num1);
        
        else
            System.out.printf("%n%d no es multiplo de %d%n", num2, num1);
        
        return multiplo;
        
    }

}
