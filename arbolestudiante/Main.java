package arbolestudiante;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final ArbolB a = new ArbolB();
       // a.Insertar(new Estudiante(1, "anderson", 3.8, 32033));
        final Scanner scanner = new Scanner(System.in);
        int menu = 0;
               
        do {

            System.out.println("**************************************************************************");
            System.out.println("                             PROYECTO DE ESTUDIANTE");
            System.out.println("**************************************************************************");
            System.out.println("1. Mostrar Arbol de estudiantes");
            System.out.println("2. Mostrar estudiantes Aprobados");
            System.out.println("3. Mostrar estudiantes Reprobados");
            System.out.println("4. Buscar estudiantes por codigo");
            System.out.println("5. Agregar estudiantes");
            System.out.println("6. Eliminar estudiantes");
            System.out.println("7. salir");
            System.out.println("**************************************************************************");
            menu = scanner.nextInt();

           
            switch (menu) {

                case 1:
                    int submenu = 0;
                    int selec = 0;
                    int selec2 = 0;
                    int codigo;
                    String nombre;
                    double nota;
                    int telefono;
                    do {
                        System.out.println(
                                "*************************************************************************************");
                        System.out.println("                         METODOS PARA VER ESTUDIANTES POR CODIGO");
                        System.out.println(
                                "*************************************************************************************");
                        System.out.println("1. Mostrar Arbol de estudiantes  de menor a mayor");
                        System.out.println("2. Mostrar Arbol de estudiantes de mayor a menor");
                        System.out.println("3. Volver al menú principal");
                        System.out.println(
                                "************************************************************************************");
                        submenu = scanner.nextInt();

                        switch (submenu) {
                            case 1:
                                a.InOrden(a.getRaiz());
                                break;
                            case 2:
                                a.InOrden2(a.getRaiz());
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("ERROR");

                        }

                    } while (submenu != 3);
                    break;
                case 2:
                    a.Aprobados(a.getRaiz());
                    break;
                case 3:
                    a.Reprobados(a.getRaiz());
                    break;
                case 4:
                    
                    System.out.println("Ingrese codigo del estudiante a Buscar");
                    selec = scanner.nextInt();
                  
                    if(a.Buscar(a.getRaiz(), selec)== true){
                      
                    }else{
                        System.out.println("No se encontro el estudiante "+selec);
                    }
                  
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del estudiante");
                    codigo = scanner.nextInt();
                    System.out.println("Ingrese nombre del estudiante");
                    nombre = scanner.next();
                    System.out.println("Ingrese Nota del estudiante");
                    nota = scanner.nextDouble();
                    System.out.println("Ingrese el telefono del estudiante");
                    telefono = scanner.nextInt();
                    a.Insertar(new Estudiante(codigo, nombre, nota, telefono));
                    System.out.println("Agregado correctamente");
                    break;
                case 6:
                    System.out.println("Ingrese codigo del estudiante a Eliminar");
                    selec2 = scanner.nextInt();

                    if(a.EliminarEstudiante(a.getRaiz(), selec2)== true){
                      
                    }else{
                        System.out.println("No se encontro el estudiante "+selec2);
                    }
                 
                    break;
                case 7:
                    System.out.println("Gracias!");
                    break;
                default:
                    System.out.println("ERROR");
            }

        } while (menu != 7);

    }
}
