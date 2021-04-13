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
public class Televisor {
     private String color;
    private int TiempoDeRespuesta;
    private int AnguloDeVision;
    private float tamano;
    public static int colores = 16;
    public static final String Peso = "4.2kg";
    
    public static String encender(){
        return "El televisor esta encendido";
    }
    
    public static String apagar (){
        return "El televisor esta apagado";
    }
    
    
      public String getColor(){
        return color;
    }
    
    public void setColor(String color){
     this.color=color;
    }
    
    public int getTiempoDeRespuesta (){
        return TiempoDeRespuesta;
    }
    
    public void setTiempoDeRespuesta (int TiempoDeRespuesta){
        this.TiempoDeRespuesta = TiempoDeRespuesta;
    }
    
    public int getAnguloDeVision (){
        return AnguloDeVision;
    }
    
    public void setAnguloDeVision (int AnguloDeVision){
        this.AnguloDeVision = AnguloDeVision;
    }
    
    public float getTamano(){
        return tamano;
    }
    
    public void setTamano (float tamano){
        this.tamano = tamano;
    }
}
