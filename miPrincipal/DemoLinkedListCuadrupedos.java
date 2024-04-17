/*
 * Proposito: Se genenrara una lista de 10000 cuadrupedos
 * de forma aleatoria entre 4 tipos
 * Despues se impimira un resumen de los cuadrupedos
 * multiplos de 10000 y mostrar el acumulado de cada tipo
 */
import java.util.*;
import cuadrupedo.Cuadrupedo;

public class DemoLinkedListCuadrupedos {
    public static void menu() {
        System.out.println("************************");
        System.out.println("ArrayList de cuadrupedos");
        System.out.println("************************");
        System.out.println();
        try {
            List<Cuadrupedo>cuadrupedos = new LinkedList<>() {
                String[] tipos = {"Leon","Perro","Gato","Elefante"};
                Random r = new Random();
                for(int i = 1; i <= 10000;i++){
                    
                }  
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   
