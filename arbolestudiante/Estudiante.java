package arbolestudiante;

public class Estudiante {

    private int codigo;
    private String nombre;
    private double nota;
    private int telefono;

    public Estudiante(int codigo, String nombre, double nota, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "_______________________________________________\n"+"Estudiante\n" + "Codigo:" + codigo + ", \nnombre=" + nombre + ", \nnota=" + nota + ", \ntelefono=" + telefono+"\n";
    }
    
    
    
    
}
