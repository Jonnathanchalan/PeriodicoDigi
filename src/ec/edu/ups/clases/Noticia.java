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
public class Noticia {
     protected int codigo;
     private String titulo;
     private String autor;
     private String[] fecha;
     private String contenido;
     private String multimedia;
      
      
      public void setCodigo(int codigo){
          this.codigo=codigo;
      }
      
       public void setTitulo(String Titulo){
          this.titulo=titulo;
      }
       public void Autor(String autor){
           this.autor=autor;
       }
       public void setContenido(String Contenido){
          this.contenido=contenido;
      }
       public void setMultimedia(String Multimedia){
          this.multimedia=multimedia;
      }
       public int getCodigo(){
           return this.codigo;
       }
       public String getTitulo(){
           return this.titulo;
       }
       public String getAutor(){
           return this.autor;
       } 
       
       public String getContenido(){
           return this.contenido;
       } 
       public String getMultimedia(){
           return this.multimedia;
       } 
    
}
