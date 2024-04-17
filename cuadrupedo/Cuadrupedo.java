package cuadrupedo;

public class Cuadrupedo {
    private int IDcuadrupedo;
    private String tipo;
    public Cuadrupedo(int iDcuadrupedo, String tipo) {
        IDcuadrupedo = iDcuadrupedo;
        this.tipo = tipo;
    }
    public int getIDcuadrupedo() {
        return IDcuadrupedo;
    }
    public void setIDcuadrupedo(int iDcuadrupedo) {
        IDcuadrupedo = iDcuadrupedo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Cuadrupedo -> " + IDcuadrupedo + ", tipo = " + tipo;
    }
    
}
