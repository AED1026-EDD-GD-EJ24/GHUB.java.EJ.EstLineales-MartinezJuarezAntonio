package miPrincipal;
import java.util.*;
public class DemoStack {
    public static void menu() {
        //crear mi pila
        Stack<Integer> pila = new Stack<Integer>();
        //ampliar elementos
        pila.push(2);
        pila.push(5);
        pila.push(7);
        pila.push(10);
        //consultar la posicion del elemento
        System.out.println("Posicion del elemento invocado 2 "+pila.search(2));
        System.out.println("Posicion del elemento invocado 10 "+pila.search(10));
        System.out.println("Posicion del elemento invocado 7 "+pila.search(7));
        System.out.println("Posicion del elemento invocado 5 "+pila.search(5));
        //consultar el elemento del tope 
        System.out.println("El elemento del tope es = "+pila.peek());
        //desapilar
        pila.pop();
        System.out.println("El elemento del tope es "+pila.peek());
        pila.pop();
        System.out.println("El elemento del tope es "+pila.peek());
    }
}
