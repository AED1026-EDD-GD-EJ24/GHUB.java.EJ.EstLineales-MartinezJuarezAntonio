import java.util.LinkedList;
import java.util.Queue;
public class DemoQueue {
    /*
     * La API de java trae implementado la cola mediante la interface
     * java.util.Queue, como es una interface se requiere instanciar
     * como un objeto en concreto, esta interface se puede implemetar
     * con la API collection de Java:
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