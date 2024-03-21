
public class Persona {
    private String nombre;
    private int edad;
    private String nacionalidad;
    public Persona(String nombre, int edad, String nacionalidad){
        this.edad = edad;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
}
