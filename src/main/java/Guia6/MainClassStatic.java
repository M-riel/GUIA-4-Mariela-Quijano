/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author Mariela Q
 */
public class MainClassStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(Coche.numeroRuedas);
        System.out.println("El Coche tiene su timón del lado: " + Coche.timon);
        
        System.out.println("El metodo retorna :" + Coche.arrancar());
        System.out.println("El metodo retorna :" + Coche.combustible());
        System.out.println("El metodo retorna :" + Coche.frenar());
        System.out.println("El metodo retorna :" + Coche.girar());
    
        Coche toyota = new Coche ();
        toyota.setColor("Rojo");
        System.out.println ("El color del caro es: " + toyota.getColor());
        
        toyota.setVelocidad(100);
        System.out.println("La velocidad maima del carro es: " + toyota.getVelocidad());
        
        toyota.setTamano(7);
        System.out.println("El tamaño del carro es: " + toyota.getTamano());
        
        if (toyota instanceof Coche){
            System.out.println("En efecto toyota es una instancia de Coche");
        }
        
        else{
            System.out.println("El caarro toyota no es una instancia de Coche");
        }
      }
    
}
