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
            System.out.println("3): Delimitadores");
            System.out.println("4): Exprecion infija");
            System.out.println("5): ");
            System.out.println("6): Queue");
            System.out.println("7): Tabla de dispercion");

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
                case 3:
                    DemoDelimitadores.menu();
                    break;
                case 4:
                    //tarea
                    break;
                case 5:
                    DemoCola.menu();
                    break;
                case 6:
                    DemoQueue.menu();
                    break;
                case 7:
                    DemoTablaDispercion.menu();
                    break;
                case 8:
                
                    break;
                default:
                System.out.println("Opcion no encontrada");
                    break;
            }
        } while (opc != 0);
    }
}
