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
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            //el nuevo nodo se inserta al inicio de la lista
            if(pos==0){
                nuevo.setSiguiente(Cabeza);
                Cabeza = nuevo;
            }
            else{
                //el nuevo nodo se inserta al final de la lista
                if(pos==tamanio){
                    Nodo<T> aux = Cabeza;
                    while(aux.getSiguiente()!=null){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                }
                else{
                    //el nuevo nodo se inserta en cualquier posicion de la lista
                    Nodo<T> aux = Cabeza;
                    for(int i=0; i<=pos-2; i++){
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;
        }
        else{
            throw new PosicionIlegalException();
        }
    }
     //Devueve el valor de una determinada posicion
     public T getValor(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio)
        {
            T valor;
            if(pos ==0){
                valor = Cabeza.getValor();
                return valor;
            }
            else{
                Nodo<T> aux = Cabeza;
                for(int i=0; i<=pos-1; i++){
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();
            }
            return valor;
        }
        else{
            throw new PosicionIlegalException();
        }
    }
    public void remover (int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio){
            if (pos==0){
                //el nodo a eliminar esta en la primera posicion
                Cabeza = Cabeza.getSiguiente();
                tamanio--;
            }
            //se elimina en medio y al final
            else{
                Nodo<T> aux = Cabeza;
                for(int i=0;i<=pos-2;i++){
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            }
        }
        else{
            throw new PosicionIlegalException();
        }
    }
    //elimina toda la lista
    public void limpiar(){
        Cabeza=null;
        tamanio=0;
    }
}