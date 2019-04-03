/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * RedSocial
 * clase que permite guardar las redes sociales
 * @version 2.0
 * @since 2019
 * @author jonnathan
 * 
 */
public class RedSocial {

    @Override
    public String toString() {
        return "RedSocial{" + "nombre=" + nombre + ", url=" + url + '}';
    }
    protected int codigo;
    private String nombre;
     private String url;
      private String[] publicaciones ;
      
      public void setCodigo(int codigo){
          this.codigo=codigo;
      }
      
      public void setNombre(String nombre){
          this.nombre=nombre;
      }
      
      
       public void setUrl(String url){
          this.url=url;
      }
       
       public int getCodigo(){
           return this.codigo;
       }
       public String getNombre(){
           return this.nombre;
       }
       public String getUrl(){
           return this.url;
       } 
}
