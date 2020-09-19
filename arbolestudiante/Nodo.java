package arbolestudiante;

public class Nodo {
    private Estudiante estudiante;
    private Nodo izq;
    private Nodo der;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        izq = der = null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    @Override
    public String toString() {
        return "Nodo{" + "estudiante=" + estudiante + ", izq=" + izq + ", der=" + der + '}';
    }

    

    

}