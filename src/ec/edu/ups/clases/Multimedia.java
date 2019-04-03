/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * multimedia
 * clase que permite dar formato el tamaño y la ubicacion de las noticias
 * @version 2.0
 * @since 2019
 * @author jonnathan
 * 
 */
public class Multimedia {
   
    protected int codigo;
    private String formato;
    private Date fechacreacion;
     private String tamañobytes;
     private String[] ubicacion;
     private String nombre;
      
      
      public void setCodigo(int codigo){
          this.codigo=codigo;
      }
      
       public void setformato(String formato){
          this.formato=formato;
      }
       public void setTamañoByte(String TamañoByte){
           this.tamañobytes=tamañobytes;
       }
       public void setNombre(String nombre){
          this.nombre=nombre;
      }
       public int getCodigo(){
           return this.codigo;
       }
       public String getFormato(){
           return this.formato;
       }
       public String getTamañoBytes(){
           return this.tamañobytes;
       } 
       public String getNombre(){
           return this.nombre;
       } 
    
}    

