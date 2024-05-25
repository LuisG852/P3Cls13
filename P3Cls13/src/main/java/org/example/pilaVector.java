package org.example;

import java.util.ArrayList;
import java.util.List;

public class pilaVector {
    private static int INICIAL = 49; //este es el tamano maxiimo de la pila

    private int cima;

    private List<Object> listaPila;

    public pilaVector(){
        cima = -1;
        listaPila = new ArrayList<>(INICIAL);
    }
    public void insertar(Object elemento) throws Exception{
        cima++;
        listaPila.add(elemento);
    }

    public Object quitar() throws Exception {
        Object aux;
        if(pilaVacia()){
            throw new Exception("Pila Vacia(Underflow)");
        }
        aux = listaPila.remove(cima);
        cima  -- ;
        return aux;
    }

    public boolean pilaVacia(){
        return cima == -1;
    }
    public boolean pilaLlena(){
        return cima == INICIAL -1;
    }

    public void limpiarPila() throws Exception {
        while(pilaVacia())quitar();
        }
    }
