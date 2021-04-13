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
public class MainClassTele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("El dispositivo posee " + Televisor.colores + " millones de colores.");
        System.out.println("El peso del televisor es de: " + Televisor.Peso);
        
        System.out.println("El metodo retorna :" + Televisor.encender());
        System.out.println("El metodo retorna :" + Televisor.apagar());
        
        
        Televisor LG = new Televisor ();
        LG.setColor("Negro");
        System.out.println ("El color del televisor: " + LG.getColor());
        
        LG.setTiempoDeRespuesta(5);
        System.out.println("La tiempo de  respuesta : " + LG.getTiempoDeRespuesta());
        
        LG.setTamano(40);
        System.out.println("El pulgadas del televisor: " + LG.getTamano());
        
        if (LG instanceof Televisor){
            System.out.println("En efecto toyota es una instancia de Televisor");
        }
        
        else{
            System.out.println("El caarro toyota no es una instancia de Televisor");
        }
        
    }
    
}
