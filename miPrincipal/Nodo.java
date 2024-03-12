package miPrincipal;
public class Nodo<T>{
    //Atributo valor de tipo T almacena la referencia al objeto 
    //que se guarda en el nodo
    private t valor;
    //Referencia al siguiente nodo enlazado
    private Nodo<t> siguiente;
    //constructor por defecto
    public Nodo(){
        valor = null;
        siguiente = null;
    }
    //devuelve el valor
    public t getValor(){
        return valor;
    }
    //modifica el valor
    public void setValor(t valor){
        this.valor = valor;
    }
    //Devuelve el atributo siguiente
    public Nodo<t> getSisguiente(){
        return siguiente;
    }
    //modifica el atributo siguiente
    public void setSiguiente(Nodo <t> siguiente){
        this.siguiente = siguiente;
    }
}
