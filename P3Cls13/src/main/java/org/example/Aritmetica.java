package org.example;

public class Aritmetica {



        //evaluar una expresión aritmética
        public static int evaluar(String expresion) throws Exception {
            // Inicialización de pilas para operandos y operadores
            pilaLineal operandos = new pilaLineal();
            pilaLineal operadores = new pilaLineal();
            int resultado = 0;
            int operando1, operando2;
            char operador;
            int i = 0;
            while (i < expresion.length()){
                // si el carácter actual es un espacio, se ignora y se avanza al siguiente carácter
                if (expresion.charAt(i) == ' '){
                    i++;
                    // Si el carácter actual es un operador, se inserta en la pila de operadores y se avanza al siguiente carácter
                } else if (expresion.charAt(i) == '+' || expresion.charAt(i) == '-' || expresion.charAt(i) == '*' || expresion.charAt(i) == '/'){
                    operadores.insertar(expresion.charAt(i));
                    i++;
                    // Si el carácter actual es un número, se extrae el número completo y se inserta en la pila de operandos
                } else {
                    String numero = "";
                    while (i < expresion.length() && expresion.charAt(i) != ' ' && expresion.charAt(i) != '+' && expresion.charAt(i) != '-' && expresion.charAt(i) != '*' && expresion.charAt(i) != '/'){
                        numero += expresion.charAt(i);
                        i++;
                    }
                    operandos.insertar(Integer.parseInt(numero));
                }
            }
            // Bucle para evaluar la expresión
            while (!operadores.pilaVacia()){
                try {
                    // Se extraen dos operandos y un operador de las pilas
                    operando2 = (int) operandos.quitar();
                    operando1 = (int) operandos.quitar();
                    operador = (char) operadores.quitar();
                    // Se realiza la operación correspondiente y se almacena el resultado en la pila de operandos
                    switch (operador){
                        case '+':
                            resultado = operando1 + operando2;
                            break;
                        case '-':
                            resultado = operando1 - operando2;
                            break;
                        case '*':
                            resultado = operando1 * operando2;
                            break;
                        case '/':
                            resultado = operando1 / operando2;
                            break;
                    }
                    operandos.insertar(resultado);
                } catch (Exception e) {
                    // En caso de excepción, se imprime el mensaje de la excepción
                    System.out.println(e.getMessage());
                }
            }
            // Se devuelve el resultado final de la expresión
            return resultado;
        }
    }


