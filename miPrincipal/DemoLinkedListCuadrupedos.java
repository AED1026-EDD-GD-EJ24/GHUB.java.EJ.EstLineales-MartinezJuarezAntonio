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
        try{
            List<Cuadrupedo> cuadrupedos = new LinkedList<>();
            String [] tipos ={"León","Gato","Perro","Elefante"};
            Random random = new Random();
            for(int i=1;i<=10000;i++){
                String tipo = tipos[random.nextInt(tipos.length)];
                cuadrupedos.add(new Cuadrupedo(i, tipo));
            }
            int leonCount = 0, gatoCount =0, perroCount=0,elefanteCount=0;
            for(Cuadrupedo cuadrupedo:cuadrupedos){
                if(cuadrupedo.getIDcuadrupedo()%1000==0){
                    System.out.println("ID"+cuadrupedo.getIDcuadrupedo()+
                      ",tipo: "+cuadrupedo.getTipo());
                }
                switch (cuadrupedo.getTipo()) {
                    case "León":
                        leonCount++;
                        break;
                    case "Gato":
                        gatoCount++;
                        break;
                    case "Perro":
                        perroCount++;
                        break;
                    case "Elefante":
                       elefanteCount++;
                       break;
                }

            }
            System.out.println("Resumen");
            System.out.println("Leones: "+leonCount);
            System.out.println("Elefantes: "+elefanteCount);
            System.out.println("Perros: "+perroCount);
            System.out.println("Gatos: "+gatoCount);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
