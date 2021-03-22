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
public class Ejer1ClassInter implements Ejer1Interface {

    @Override
    public int Op1(int x, int y, int z) {
       return (x + y) / z ;
    }

    @Override
    public int Op2(int x, int y, int z) {
        return (x + y + z) / (y + z);
    }
    
}
