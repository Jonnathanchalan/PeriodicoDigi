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
public class EstructuraPeriodica {
    protected int codigo;
    private String nombre;
     private String periodico;
      private String[] fecha ;
      
      public void setCodigo(int codigo){
          this.codigo=codigo;
      }
      
      
      
      public void setNombre(String nombre){
          this.nombre=nombre;
      }
      
      
       public void setPeriodico(String periodico){
          this.periodico=periodico;
      }
       
       public int getCodigo(){
           return this.codigo;
       }
       public String getNombre(){
           return this.nombre;
       }
       public String getPeriodico(){
           return this.periodico;
       } 

    
}
