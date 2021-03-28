/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;
import java.util.Scanner;
/**
 *
 * @author Mariela Q
 */
public class EjerWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Realizamos un cuadrado con un caracter introducido por el usuario
       Scanner car=new Scanner (System.in);
        String f;
        int i=1;
        int a=1;
        int n=1;
       
       System.out.print("Ingrese un caracter: ");
       f=car.next();
       
       while (i <= 6)
       {
           System.out.print(" "+ f);
           i++;
       }
       
       
       while (a <= 4)
       {
           System.out.print("\n "+f+"         "+f);
           a++;
           
       }
       System.out.println(" ");
       while (n <= 6){
          System.out.print(" "+f); 
          n++;
       }
       System.out.println(" \n");
                
           
  }     
 } 

