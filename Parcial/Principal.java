
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Cola c = new Cola();
        Scanner s = new Scanner(System.in);
        //                       ID  NOMBRE HORA  VENTAS  
        c.encolar(new Trabajador(1, "Anyi", 8, 10));
        c.encolar(new Trabajador(2, "Arlinson", 12, 200));
        c.encolar(new Trabajador(3, "Alex", 7220, 24));
        c.encolar(new Trabajador(4, "Ana", 3320, 3));
        c.encolar(new Trabajador(5, "Anderson", 3, 100));
        int menu = 0;

        do {

      
                System.out.println("**************************************************************************");
                System.out.println("                             MENÚ");
                System.out.println("**************************************************************************");
                System.out.println("1. Mostrar la cola de trabajadores");
                System.out.println("2. Mostrar el trabajador con mas ventas  y el de menor ventas");
                System.out.println("3. Ver cuanto gana un trabajador segun horas laboradas (1000 por hora)");
                System.out.println("4. Editar horas laboradas de un trabajador");
                System.out.println("5. Agregar nuevo trabajador");
                System.out.println("6. Salir");
                System.out.println("**************************************************************************");

                menu = s.nextInt();
                

                switch (menu) {

                    case 1:
                        System.out.println("TRABAJADORES:\n" + c.MostrarCola());
                        break;
                    case 2:
                        c.VerMayor_Menor();
                        break;
                    case 3:
                        System.out.println("Ingrese el id del trabajador ");
                        int id = s.nextInt();

                        System.out.println(c.Pagar(id));

                        break;
                    case 4:
                        System.out.println("Ingrese el id del trabajador ");
                        int id2 = s.nextInt();

                        System.out.println(c.editarhoras(id2));

                        break;
                    case 5:
                        System.out.println("Ingrese el nombre del trabajador ");
                        String nombre = s.next();

                        System.out.println("Ingrese el id del trabajador ");
                        int idnuevo = s.nextInt();

                        System.out.println("Ingrese las horas del trabajador ");
                        int horanuevo = s.nextInt();

                        System.out.println("Ingrese el numero de vemtas del trabajador ");
                        int ventasnuevo = s.nextInt();

                        c.encolar(new Trabajador(idnuevo, nombre, horanuevo, ventasnuevo));
                        System.out.println("REGISTRADO CON EXITO");
                        break;
                    case 6:
                        System.out.println("Gracias!");
                        break;
                    default:
                        System.out.println("ERROR");
                }
         

        } while (menu != 6);

    }

}
