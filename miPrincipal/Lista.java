public class Lista<T> {
    //atributos
    //primer nodo de la lista
    private Nodo<T> Cabeza;
    //total de elementos de la lista
    private int tamanio;
    public Lista(){
    Cabeza = null;
    tamanio = 0; 
    }
    //devuelve el tamaño de la lista
    public int getTamanio(){
        return tamanio;
    }
    public boolean esVacia(){
        if (Cabeza == null) {
            return true;
        }else{
            return false;
        }
    }
    public void agregar(T valor){
        Nodo<T>nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            Cabeza = nuevo;
        }else{
            //agregar al final de la lista
            Nodo<T> aux = Cabeza;
            while (aux.getSiguiente()!=null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    
}
