package org.example;

public class pilaLineal {

    private static int TAMPILA = 49; //este es el tamano maxiimo de la pila

    private int cima;

    private Object[] listaPila;

    public pilaLineal(){
        cima = -1;
        listaPila = new Object[TAMPILA];
    }
    public void insertar(Object elemento) throws Exception{
        if(pilaLlena()){
            throw new Exception("Ups, StackOverflow");
        }
        cima++;
        listaPila [cima]= elemento;
    }

    public Object quitar() throws Exception {
        Object aux;
        if(pilaVacia()){
            throw new Exception("Pila Vacia(Underflow)");
        }
        aux = listaPila[cima];
        cima  -- ;
        return aux;
    }

    public boolean pilaVacia(){
        return cima == -1;
    }
    public boolean pilaLlena(){
        return cima == TAMPILA -1;
    }

    public void limpiarPila(){
        cima = -1;
    }
}
