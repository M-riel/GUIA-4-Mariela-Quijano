/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

/**
 *
 * @author Mariela Q
 */
public class AbstractMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        AbstractTest prueba = new AbstractTest();
        System.out.println("La suma es: " + prueba.suma(10, 15));
        System.out.println("La resta es: " + prueba.rest(50, 10));
        System.out.println("La división es: " + prueba.diversio(50, 10));
        System.out.println("La multiplicación es: " + prueba.multiplicación(10, 10));
    }
    
}
