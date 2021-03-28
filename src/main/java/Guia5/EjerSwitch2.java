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
public class EjerSwitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.print("Escoje cual opción deseas tomar (1, 2 o 3) ");
        num=Entrada.entero();
        switch(num){
            case 1:
              System.out.print("Has seleccionado la opción 1"); 
              break;
              
            case 2:
            System.out.print("Has seleccionado la opción 2"); 
              break;
              
            case 3:
              System.out.print("Has seleccionado la opción 3"); 
              break;
              
        default:  
            System.out.print("No seleccionaste el numero correcto");
    }
    
    }
}
