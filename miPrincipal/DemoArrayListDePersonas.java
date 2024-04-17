    /*
     * Proposito: Crear un ArrayList de objetos Persona
     * Crearemos 1000 personas de forma aleatoria 
     * considerando que sus alturas fluctuen entre 100 y 200 cm
     * finalmente mostrar por consola toda los objetos personas
     * creados asi como la media de sus alturas
     */
import java.util.*;
import pesonas.Persona;;
public class DemoArrayListDePersonas {
    
    public static void menu() {
        System.out.println("*********************");
        System.out.println("ArrayList de personas");
        System.out.println("*********************");
        System.out.println();
        try {
            List<Persona>lp = new ArrayList<Persona>();
            Random r = new Random();
            Persona tmp = null;
            int sumaaltura = 0;
            for(int i = 0; i <1000; i++){
                lp.add(new Persona(i," Persona "+i,r.nextInt(100)+100));
                Iterator<Persona>it = lp.iterator();
                while (it.hasNext()) {
                    tmp = it.next();
                    System.out.println(tmp);
                    sumaaltura += tmp.getAltura();
                }
                System.out.println("La media del conjunto de personas es "+sumaaltura/lp.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
