public class Nodo<T>{
    //Atributo valor de tipo T almacena la referencia al objeto 
    //que se guarda en el nodo
    private T valor;
    //Referencia al siguiente nodo enlazado
    private Nodo<T> siguiente;
    private Nodo<T> anterior;
    //constructor por defecto
    public Nodo(){
        valor = null;
        siguiente = null;
        
    }
    //devuelve el valor
    public T getValor(){
        return valor;
    }
    //modifica el valor
    public void setValor(T valor){
        this.valor = valor;
    }
    //Devuelve el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //modifica el atributo siguiente
    public void setSiguiente(Nodo <T> siguiente){
        this.siguiente = siguiente;
    }
    public Nodo<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
}
