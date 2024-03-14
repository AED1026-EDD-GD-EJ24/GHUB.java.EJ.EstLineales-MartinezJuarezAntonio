package miPrincipal;

import javax.swing.JOptionPane;

public class Delimitadores {
    public boolean evaluacion(String cadena){
        Pila<String>pcaracteres = new Pila<String>();
        int i = 0;
        boolean masElementosPorLeer = true;
        while (i < cadena.length() && masElementosPorLeer) {
            char car = cadena.charAt(i);
            String s = Character.toString(car);
            i++;
            switch (car) {
                //en caso de apilar se da cuando 
                //el caracter de un operador de apertura
                //( [ { /* 
                case '(':
                    pcaracteres.apilar(charToString(')'));
                    break;
                case '[':
                pcaracteres.apilar(charToString(']'));
                    break;
                case '{':
                pcaracteres.apilar(charToString('}'));
                    break;
                case '/':
                    //verificar si el siguiente caracter sea un *
                    if (siguienteEsAsterisco(cadena, i)) {
                        pcaracteres.apilar(charToString('/'));
                        i++;
                    }
                    break;
                case ')':
                case ']':
                case '}':
                    break;
                default:
                    break;
            }
        }
        return masElementosPorLeer;
    }//termina el metodo
    private static String charToString(char ch){
        return String.valueOf(ch);
    }
    private static boolean siguienteEsAsterisco(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if (car=='*') {
            return true;
        }else{
            return false;
        }
    }
    private static boolean siguienteEsDiagonal(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if (car=='/') {
            return true;
        }else{
            return false;
        }
    }
}