import java.util.LinkedList;
import java.util.Queue;
public class DemoQueue {
    /*
     * La API de java trae implementado la cola mediante la interface
     * java.util.Queue, como es una interface se requiere instanciar
     * como un objeto en concreto, esta interface se puede implemetar
     * con la API collection de Java:
     *  java.util.LinkedList
     *  java.util.PriorityQueue
     * LinkedList es una aplicación de cola estándar
     * PriorityQueue es una cola de prioridades que almacena
     * sus elementos internos de acuerdo a un orden.
     * Las operaciones básica de Queue son:
     * add(). inserta un elemento en la cola
     * remove(). devuelve y remueve el primer elemento de la cola
     * peek(). devuelve el primer elmentos de la cola  y devuelve
     * null cuando la cola esta vacía
     */
    public static void menu() {
        System.out.println("************");
        System.out.println("    Queue   ");
        System.out.println("************");
        System.out.println("");
        Queue miCola = new LinkedList();
        //agregar unos elementos a la cola
        miCola.add("Elemento 0");
        miCola.add("Elemento 1");
        miCola.add("Elemento 2");
        //muestra los elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es: "+miCola.peek());
        // eliminar el primer elemento de la cola 
        System.out.println(""+miCola.remove());
        System.out.println("El primer elemento de la cola es: "+miCola.peek());
        //vuelvo a eliminarlo
        System.out.println(""+miCola.remove());
        System.out.println("El primer elemento de la cola es: "+miCola.peek());
        //vuelvo a eliminarlo
        System.out.println(""+miCola.remove());
        System.out.println("El primer elemento de la cola es: "+miCola.peek());
    }
}