package arbolBinarioOrdenado;

public class Estudiante implements Comparable{
    
    private int codigo;
    private String nombre;
    
    public Estudiante(final int codigo, final String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(final int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }
    @Override
    public boolean esIgual(Object q){
        Estudiante obj =(Estudiante)q;
        return(this.codigo==obj.getCodigo());
    }
    @Override
    public boolean esMayor(Object q){
        Estudiante obj =(Estudiante)q;
        return(this.codigo>obj.getCodigo());
    }
    @Override
    public boolean esMenor(Object q){
        Estudiante obj =(Estudiante)q;
        return(this.codigo<obj.getCodigo());
    }

    @Override
    public String toString() {
        return "codigo:" + codigo + ", nombre:" + nombre ;
    }

    
}
