package org.example;

public class Main {




    public static void palindromo() {
        pilaLineal pila = new pilaLineal();
        String palabra = "oso";
        String pabraInvertida = "";
        //creamos la pila con la palabra
        for (int i = 0; i < palabra.length(); i++) {
            try {
                pila.insertar(palabra.charAt(i));
            } catch (Exception ex) {
                System.out.println("problema al insertar" + ex.getMessage());
            }
        }


        //se comprueba  si es palindroo

        while (!pila.pilaVacia()) {
            try {
                pabraInvertida += pila.quitar();
            } catch (Exception ex) {
                System.out.println("error comprobando");
            }
        }
        if (pabraInvertida.equals(palabra)) {
            System.out.println("simon, es un palindromo");
        } else {
            System.out.println("nel, no lo es");
        }

    }





    public static void main(String[] args) {
        pilaLineal pil = new pilaLineal();
        try{
            pil.insertar("hola");
            pil.insertar("mundo");
            pil.insertar("esto");
            pil.insertar("es");
            pil.insertar("una");
            pil.insertar("pila");

            while(pil.pilaVacia()){
                System.out.println("ELemento saliente:"+pil.quitar());
            }
        }catch(Exception ex){
            System.out.println("ups hay un problema"+ ex.getMessage());
        }
    }
}