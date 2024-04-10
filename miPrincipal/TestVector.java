import java.util.*;
public class TestVector {
    public static void main(String[] args) {
    //invocar al metodo obteneLista de la clase UNombre
    Collection<String>lista = UNombre.obtenerLista();
    //iterar la coleccion de nombres y mostrarlos en consola
    for(String nombre:lista){
        System.out.println(nombre);
    }
    }
}