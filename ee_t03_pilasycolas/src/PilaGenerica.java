/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class PilaGenerica<T> {
    private Nodo<T> inicio;
    
    public PilaGenerica(){
        inicio = null;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    
    public void push(T dato)
    {
        Nodo<T> aux = new Nodo<T>(dato);
        if(inicio == null)
            inicio = aux;
        else
            aux.setSiguiente(inicio);
            inicio = aux;
        //System.out.println(aux.getDato());
    }
    public T pop()
    {
        Nodo<T> aux = inicio;
        inicio = inicio.getSiguiente();
        aux.setSiguiente(null);
        T resultado = aux.getDato();
        aux = null;
        return resultado;
    }
    public T peek(){
        Nodo<T> aux = inicio;
        T resultado = null;
        if(inicio != null){
            resultado = aux.getDato();
            System.out.println(resultado);
        }
        return resultado;
    }
}



