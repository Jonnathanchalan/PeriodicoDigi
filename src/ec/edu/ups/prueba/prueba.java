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
/**
 *
 * @author jonnathan
 */
public class prueba {
    public static void main(String[] args, String formato){
        RedSocial facebook =new RedSocial();
        Seccion deportes=new Seccion();
        Multimedia imagenes=new Multimedia();
        EstructuraPeriodica portada=new EstructuraPeriodica();
        Noticia contenido=new Noticia();
        
        
        facebook.setCodigo(1);
        facebook.setNombre("facebook");
        facebook.setUrl("www.facebook.com");
        System.out.print(facebook);
        
        
        deportes.setCodigo(2);
        deportes.setNombre("deportes");
        deportes.setNoticias("noticias");
        
       
        
        
        
        int cod = facebook.getCodigo();
        System.out.println("codigo:"+cod);
        
        String res = facebook.getNombre();
        System.out.println(res+"Nombre:");
        
        
        String pag=facebook.getUrl();
        System.out.println("url:"+pag);
        
        int codi = deportes.getCodigo();
        System.out.println("codigo:"+codi);
        
        String resu = deportes.getNombre();
        System.out.println("nombre:"+resu);
        
        
        String pagi=deportes.getNoticias();
        System.out.println("noticias:"+pagi);
        
    }
}
