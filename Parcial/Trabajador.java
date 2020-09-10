
public class Trabajador {
    private int id;
    private String nombre;
    private int horas;
    private int ventas;
    public Trabajador(int id, String nombre, int horas, int ventas) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.ventas = ventas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "trabajador\n" + "id= " + id + ", nombre= " + nombre + ", horas= " + horas +", ventas= " +ventas+ '\n';
    }

  
    
}
