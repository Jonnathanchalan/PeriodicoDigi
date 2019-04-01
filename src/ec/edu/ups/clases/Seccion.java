/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *Seccion
 * clase que permite separar varias tipos de noticias
 * @version 2.0
 * @since 2019
 * @author jonnathan
 * 
 */
public class Seccion {
    protected int codigo;
    private String nombre;
     private String noticias;
      private String[] publicaciones ;
      
      public void setCodigo(int codigo){
          this.codigo=codigo;
      }
      
      public void setNombre(String nombre){
          this.nombre=nombre;
      }
      
      
       public void setNoticias(String noticias){
          this.noticias=noticias;
      }
       
       public int getCodigo(){
           return this.codigo;
       }
       public String getNombre(){
           return this.nombre;
       }
       public String getNoticias(){
           return this.noticias;
       } 

    
    }
      

    

    

