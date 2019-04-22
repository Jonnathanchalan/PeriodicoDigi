/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.EstructuraPeriodica;
import ec.edu.ups.clases.Noticia;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author jonnathan
 */
public class prueba {

        

    public prueba() throws InterruptedException{
        this.toString();
        this.wait(2);
    }
    RedSocial facebook=new RedSocial(); 
    Multimedia imagenes=new Multimedia();
    EstructuraPeriodica Portada=new EstructuraPeriodica();
    Seccion autor=new Seccion();
    Noticia Columna=new Noticia();

    private static Object fechaESPE;
    public static void main(String[] args, String formato){
         ArrayList<String>facebook;
      facebook=new ArrayList<String>();
      
      facebook.add("2019");
      facebook.add("Facebook");
      facebook.add("www.facebook.com");
      
      for(int i=0;i<facebook.size();i++){
          System.out.println("-->"+facebook.get(i)); 
      }
     
      ArrayList<String>imagenes;
        imagenes = new ArrayList<String>();
        
        imagenes.add("gpj");
        imagenes.add("Imagen");
        imagenes.add("c:portada/imagenes");
        imagenes.add("10.20");
     
        for(int r=0;r<imagenes.size();r++){
            System.out.println("-->"+imagenes.get(r));
        }
        ArrayList<String>deportes;
        deportes = new ArrayList<String>();
        
        deportes.add("Noticia de Deportes");
        deportes.add("Ecuador participara en la copa america");
        
        
        for(int d=0;d<deportes.size();d++){
            System.out.println("-->"+deportes.get(d));
        }
        
         ArrayList<String>Portada;
        Portada = new ArrayList<String>();
        
        Portada.add("AV.Don Bosco");
        Portada.add("Ecuador participara en la copa america");
        System.out.println(formato.format(fechaESPE.toString())+"-->Fecha: ");
        Portada.add("el Tiempo");
        for(int j=0;j<Portada.size();j++){
            System.out.println("-->"+Portada.get(j));
        }
         ArrayList<String>autor;
        autor = new ArrayList<String>();
        
        autor.add("NombreAutor");
        autor.add("noticia");
        System.out.println(String.format(prueba.fechaESPE.toString())+"-->Fecha: ");
         autor.add("Imagenes");
          autor.add("Cronica");
        for(int j=0;j<autor.size();j++){
            System.out.println("-->"+autor.get(j));
        }
        
        ArrayList<String>columna;
        columna = new ArrayList<String>();
        
        columna.add("NombreAutor");
        columna.add("noticia");
        System.out.println(String.format(prueba.fechaESPE.toString())+"-->Fecha: ");
         columna.add("Cronica");
          columna.add("El lia de hayer fue encontrada una persona de la tercera edad sin vida en el sector de la feria libre");
        for(int j=0;j<autor.size();j++){
            System.out.println("-->"+autor.get(j));
        }
        Date fecha0=new Date();
        SimpleDateFormat formato1=new SimpleDateFormat("dd/MM/yyyy");
            String fecha0Formateada= formato1.format(fecha0);
        GregorianCalendar fechaESPE=new GregorianCalendar(2019,4,30);
    }
    }


