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
public class MainTestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ExtendsAbstract prueba = new ExtendsAbstract();
        System.out.println("El resultado de la operación 1 es: " + prueba.Operacion1 (5, 8, 6));
        System.out.println("El resultado de la operación 2 es: " + prueba.Operacion2 (8, 6, 12));
    }
    
}
