package miPrincipal;

public class DemoDelimitadores {
    public static void menu() {
        System.out.println("*************");
        System.out.println("Delimitadores");
        System.out.println("*************");
        System.out.println("");
        String expr = "(a+b)/2";
        if (objDel.evaluacion(expr)) {
            System.out.println();
        }
    }
}
