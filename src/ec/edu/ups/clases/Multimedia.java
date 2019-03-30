/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author jonnathan
 */
public class Multimedia {
   
    protected int codigo;
    private String formato;
     private String tamañobytes;
     private String[] ubicacion;
     private String nombre;
      
      
      public void setCodigo(int codigo){
          this.codigo=codigo;
      }
      
       public void setFormato(String Formato){
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

