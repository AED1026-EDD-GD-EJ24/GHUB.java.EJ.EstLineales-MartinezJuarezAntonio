import java.util.*;
public class DemoArrayListYLinkedList {
    public static void menu() {
        System.out.println("**********");
        System.out.println("ArrayList ");
        System.out.println("LinkedList");
        System.out.println("**********");
        System.out.println();
        //declaramos
        List<Integer>lista = new LinkedList<Integer>();
        List<Integer>lista2 = new ArrayList<Integer>();

        lista.add(12);
        lista.add(15);
        lista.add(20);

        System.out.println("Dato en posicion 0 "+lista.get(0));
        System.out.println("Dato en posicion 1 "+lista.get(1));
        System.out.println("Dato en posicion 2 "+lista.get(2));
        
        lista.add(1,13);
        lista.add(3, 16);

        System.out.println("Dato en posicion 0 "+lista.get(0));
        System.out.println("Dato en posicion 1 "+lista.get(1));
        System.out.println("Dato en posicion 2 "+lista.get(2));
        System.out.println("Dato en posicion 3 "+lista.get(3));
        System.out.println("Dato en posicion 4 "+lista.get(4));
        
        lista.remove(0);
        lista.remove(3);

        System.out.println("Datos despues de la eliminacion ");
        System.out.println();
        System.out.println("Dato en posicion 0 "+lista.get(0));
        System.out.println("Dato en posicion 1 "+lista.get(1));
        System.out.println("Dato en posicion 2 "+lista.get(2));

        for (Integer aux : lista) {
            System.out.println("Elemento "+aux);
        }
        //utilizar ArrayList
        lista2.add(10);
        lista2.add(23);
        
    }
}
