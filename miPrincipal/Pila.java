public class Pila <T> {
    //el atributo cabeza apunta al tope de la pila
    private Nodo<T>cabeza;
    //almacena el total de elementos de la pila
    private int tamanio;
    //constructor por defecto
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //devuelve el total de elementos de la pila
    public int getTamanio(){
        return tamanio;
    }
    //verifica si la pila esta vacia
    public boolean esVacia(){
        return(cabeza == null);
    }
    public void apilar(T valor){
        //crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if (esVacia()) {
            //la cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //incrementar el tamaño por que hay un nuevo elemento
        tamanio++;
    }
    //eliminar un elemento de la pila
    public void retirar(){
        if (!esVacia()) {
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //devuelve el elemento almacenado en el tope de la pila
    public T cima(){
        if (!esVacia()) {
            return cabeza.getValor();
        }else{
            return null;
        }
    }
}