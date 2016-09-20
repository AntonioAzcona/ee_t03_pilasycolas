/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
import java.io.*;
import javax.swing.*;
public class Principal {
    String ruta = JOptionPane.showInputDialog("Ingrese la ruta donde se encuentra el archivo y el nombre del archivo con su extension");
    File f = new File(ruta);
    PilaGenerica p = new PilaGenerica();
    ColaGenerica c = new ColaGenerica();
    ListaSimplementeLigada l = new ListaSimplementeLigada();
    String cadena = "";
    public void leerArchivo() throws Exception
    {
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         String renglon = br.readLine();
         System.out.println("Entrada:");
         while(renglon != null){
            cadena += renglon;
             System.out.println(renglon);
            renglon = br.readLine();
         }
         System.out.println("Salida: ");
         
         if(cadena.charAt(0) == '0')
         {
             metodoPila();
         }else if(cadena.charAt(0) == '1'){
             metodoCola();
         }
         /*for(int i = 0; i < cadena.length(); i++){
             if(cadena.charAt(0) == '0')
             { 
                 if(cadena.charAt(i) == '0')
                 {
                     if(cadena.charAt(i) == '0')
                     {
                      i++;//Aumenta
                       if(cadena.charAt(i) == '0'){
                          i++;
                          p.push(cadena.charAt(i));
                          //l.insertaInicio(cadena.charAt(i));
                       }else{
                          p.push(cadena.charAt(i));
                          //l.insertaInicio(cadena.charAt(i));
                       }
                     }
                 }else if(cadena.charAt(i) == '1')
                     {
                         System.out.println(p.pop());
                         //l.eliminaUltimo();
                     }else if(cadena.charAt(i) == '2')
                     {
                         p.peek();
                         //l.getInicio();
                     }
             }else if(cadena.charAt(0) == '1'){
                 if(cadena.charAt(i) == '0')
                 {
                     if(cadena.charAt(i) == '1')
                     {
                         i++;
                       if(cadena.charAt(i) == '0'){
                            i++;
                          c.insertarCola(cadena.charAt(i));
                       }else{
                          c.insertarCola(cadena.charAt(i));
                       }
                     }
                 }else if(cadena.charAt(i) == '1')
                     {
                         i++;
                         //c.eliminarCola();
                     }
             }
         }*/
    }
   public void metodoPila()
   {
      for(int i = 1; i < cadena.length(); i++){
                 if(cadena.charAt(i) == '0')
                 {
                     i++;
                     if(cadena.charAt(i) != '0')
                     {
                         p.push(cadena.charAt(i));                       
                     }
                 }else if(cadena.charAt(i) == '1')
                     {
                         System.out.println(p.pop());
                     }else if(cadena.charAt(i) == '2')
                     {
                         p.peek();
                     }
        }
   }
   public void metodoCola() throws Exception
   {
       for(int i = 1; i < cadena.length(); i++)
       {
            if(cadena.charAt(i) == '0')
               {
                  i++;
                  if(cadena.charAt(i) != '0')
                  {
                       c.insertarCola(cadena.charAt(i));
                  }
                }else 
                {
                       System.out.println(c.eliminarCola());
                }
       }
   }
}
    // C:\\Users\\Antonio\\Documents\\TEC\\5° Semestre\\Estructura de Datos Leon\\ee_t03_pilasycolas\\datos.txt
//ENTRADA:
/*
  0       1      
  01      01
  02      02 
  03      03
  1       1
  1       1
  2       1
  1
SALIDA: 
  3       1
  2       2
  1       3
  1
*/




