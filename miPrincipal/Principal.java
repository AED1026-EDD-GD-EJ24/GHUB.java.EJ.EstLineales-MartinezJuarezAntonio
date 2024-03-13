package miPrincipal;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0 ;
        do {
            System.out.println("");
            System.out.println("Estructuras lineales");
            System.out.println("");
            System.out.println("1): Pila");
            System.out.println("2): Stack");

            System.out.println("0): Salir");
            System.out.println("Seleccione una opcion");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    DemoPila.menu();
                    break;
                case 2:
                    DemoStack.menu();
                    break;
            
                default:
                System.out.println("Opcion no encontrada");
                    break;
            }
        } while (opc != 0);
    }
}
