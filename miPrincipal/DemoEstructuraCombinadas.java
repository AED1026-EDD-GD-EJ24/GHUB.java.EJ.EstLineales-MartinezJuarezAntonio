import java.util.*;
public class DemoEstructuraCombinadas {
    public static void menu(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        HashTable2<Integer>ht = new HashTable2<Integer>();
        ht.put("par", 2);
        ht.put("par", 4);
        ht.put("par", 6);
        ht.put("impar", 1);
        ht.put("par", 8);
        ht.put("impar", 3);
        ht.put("impar", 5);
        ht.put("par", 10);
        ht.put("impar", 7);
        ht.put("impar", 9);
        LinkedList<Integer>pares = ht.get("par");
        for(Integer i:pares){
            System.out.println(i);
        }
        Collection<String>keys = ht.keys();
        for(String k:keys){
            System.out.println(k);
        }


    }
    
}
