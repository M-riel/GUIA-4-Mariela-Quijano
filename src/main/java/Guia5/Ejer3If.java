/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author Mariela Q
 */
public class Ejer3If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Verificamos si el número que introducimos es par o impar.
        int n;
        System.out.print("Introduce un número: ");
        n=Entrada.entero();
        
        if(n%2 == 0){
            System.out.println("El numero que introduciste es par y es: " + n);
        
        }   
        else if(n%2 !=0 ){
             System.out.println("El numero que introduciste es impar y es: " + n);
     
    }
    }
    
}
