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
    public void leerArchivo() throws Exception
    {
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         String renglon = br.readLine();
         String cadena = "";
         while(renglon != null){
            cadena += renglon;
            renglon = br.readLine();
         }
         System.out.println("Entrada: " + cadena);
         System.out.println("Salida: ");
         for(int i = 0; i < cadena.length(); i++){
             //if(cadena.charAt(0) == '0')
             //{ i++;
                 if(cadena.charAt(i) == '0')
                 {
                     if(cadena.charAt(i) == '0')
                     {
                      i++;//Aumenta
                       if(cadena.charAt(i) == '0'){
                          i++;
                          p.push(cadena.charAt(i));
                       }else{
                          p.push(cadena.charAt(i));
                       }
                     }
                 }else if(cadena.charAt(i) == '1')
                     {
                         p.pop();
                     }else if(cadena.charAt(i) == '2')
                     {
                         p.peek();
                     }
             //}
         }
    }
}
    // C:\\Users\\Antonio\\Documents\\TEC\\5° Semestre\\Estructura de Datos Leon\\ee_t03_pilasycolas\\datos.txt
//ENTRADA:
/*
  0  
  01
  02
  03  
  1
  1
  2
  1
SALIDA: 
  3
  2
  1
  1
*/




