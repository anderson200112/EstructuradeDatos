
import java.util.Scanner;


public class Cola {

    private Nodo inicio;
    private Nodo ultimo;
    private int tamano;

    public Cola() {
        inicio = ultimo = null;
        tamano = 0;
    }

    public boolean Vacia() {
        return inicio == null;
    }

    public void encolar(Trabajador trabajador) {
        Nodo nuevo = new Nodo(trabajador);
        if (Vacia()) {
            inicio = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
        tamano++;
    }

    public void Desacolar() {
        if (!Vacia()) {
            inicio = inicio.getSiguiente();
            tamano--;
        }
    }

    public String MostrarCola() {
        String Cola = "";
        if (!Vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                Cola += aux.getTrabajador().toString();
                aux = aux.getSiguiente();
            }

        }
        return Cola;
    }
    
    public String Pagar(int id) {
        String Cola = "no exite";
        if (!Vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (id == aux.getTrabajador().getId() ) {
                   Cola = "El trabajador recibe como pago $"+(aux.getTrabajador().getHoras()*1000)+" pesos.";
                }
                aux = aux.getSiguiente();
            }

        }
        return Cola;
    }
       Scanner s = new Scanner(System.in);
                   
      public String editarhoras(int id) {
        String Cola = "no exite";
        if (!Vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (id == aux.getTrabajador().getId() ) {
                    System.out.println("Ingrese la nueva hora del trabajador "+aux.getTrabajador().getNombre());
                    int  horas = s.nextInt();
                    aux.getTrabajador().setHoras(horas);
                   Cola = "El trabajador " +aux.getTrabajador().getNombre() +" trabaja ahora "+horas+" horas";
                }
                aux = aux.getSiguiente();
            }

        }
        return Cola;
    }



    public void VerMayor_Menor() {
        if (!Vacia()) {
            Nodo aux = inicio;
            int May = 0;
            String trabaMayor = "";
            String trabaMenor = "";
            int Men = aux.getTrabajador().getVentas();
            while (aux != null) {
                if (aux.getTrabajador().getVentas() > May) {
                    May = aux.getTrabajador().getVentas();
                   trabaMayor = "Nombre: "+aux.getTrabajador().getNombre() +" ventas de " +aux.getTrabajador().getVentas()+"\n" ;
                }
                if (aux.getTrabajador().getVentas() <= Men) {
                    Men = aux.getTrabajador().getVentas();
                    trabaMenor = "Nombre: "+aux.getTrabajador().getNombre() +" ventas de " +aux.getTrabajador().getVentas()+"\n" ;
                }

                aux = aux.getSiguiente();
            }
            System.out.println("Mayor \n" + trabaMayor + "Menor: \n" + trabaMenor);
        }
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Cola{" + "inicio=" + inicio + ", ultimo=" + ultimo + ", tamano=" + tamano + '}';
    }

}
