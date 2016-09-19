/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class ColaGenerica<T> {
    Nodo<T> frente, fin;
    
    public ColaGenerica(){
        frente = fin = null;
    }
    public boolean colaVacia(){
        return frente == null;
    }
    public void insertarCola(T dato){//Pone elemento por el final
        Nodo<T> aux = new Nodo<T>(dato);
        if(colaVacia()){
            frente = aux;
        }else{
            fin.setSiguiente(aux);
        }
        fin = aux;
        System.out.print(aux);
    }
    public T eliminarCola() throws Exception
    {
        T aux;
        if(!colaVacia())
        {
            aux = frente.getDato();
            frente = frente.getSiguiente();
        }else
            throw new Exception("No se puede eliminar de una cola vacia");
            return aux;
    }
    public T frenteCola() throws Exception //Acceso al primero de la cola
    {
        if(colaVacia()){
            throw new Exception("Error: Cola vacia");
        }
        return(frente.getDato());
    }
}
