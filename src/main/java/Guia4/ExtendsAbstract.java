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
public class ExtendsAbstract extends AbstractEJ1 {

    @Override
    public int Operacion1(int a, int b, int c) {
        return (a + b) / c ;
    }

    @Override
    public int Operacion2(int a, int b, int c) {
        return (a + b + c) / (a + c) ;   
    }
    
}
