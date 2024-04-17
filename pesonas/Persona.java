package pesonas;

public class Persona {
    private int IDpersona;
    private String nombre;
    private int altura;

    public Persona(int IDpersona, String nombre, int altura){
        this.altura = altura;
        this.IDpersona = IDpersona;
        this.nombre = nombre;
    }
    public int getAltura(){
        return altura;
    }
    //omitir otros metodos get y set para simplificar
    public String toString(){
        return "Persona -> "+IDpersona+"\nnombre = "+nombre+"\naltura = "+altura;
    }
}
