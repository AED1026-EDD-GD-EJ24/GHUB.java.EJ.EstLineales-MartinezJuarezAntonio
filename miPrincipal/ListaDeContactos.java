public class ListaDeContactos {
    //Atributos
    private Lista<Contacto>contactos;
    //metodos
    //constructos
    public ListaDeContactos() {
        contactos = new Lista<Contacto>();
    }
    /*
     * Retorna una lista de todos los contactos
     */
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }
    /*
     * Agrega un nuevo contacto a la lista, si todavia no hay ningun contacto
     * con los nombres apellidos dados
     */
    public boolean agregarContacto(String nombres, String apellidos, String direccion, String correo, 
                                    String telefono, String celular)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres,apellidos);
        if (con == null) {
            Contacto nuevo = new Contacto(nombres, apellidos,direccion,correo,telefono,celular);
            contactos.agregar(nuevo);
            return true;
        }else{
            return false;
        }
    }
    /*
     * Busca un contacto dado sus nombres y apellidos
     * return el contacto si lo encuentra, null en caso contrario
     */
    public buscarContacto(String nombres, String apellidos)throws PosicionIlegalException{
        for(int i = 0; i<contactos.getTamanio();i++){
            Contacto con = contactos.getValor(i);
            if (nombres.equals(con.getNombres())&&apellidos.equals(con.getApellidos())) {
                return con;
            }
        }
        return null;//no lo encontro, devuelve nulo
    }
    /*Elimina un contacto dados su nombre y apellidos
    si el usuario existe en la lista lo elimina
    return true si se pudo eliminar, falso si no se pudo eliminar
     */
    public boolean eliminarContacto(String nombres,String apellidos)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);
    }
}
