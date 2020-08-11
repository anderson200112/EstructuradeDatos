
public class Principal {

    public static void main (String args[]) {
     
        tarea sll = new tarea();

        sll.insert(1);
        sll.insert(3);
        sll.insert(2);
        sll.insert(9);


       
        System.out.println("MOSTRAR LISTA ");
        sll.print();

        System.out.println("MOSTRAR POSICION 2");
        sll.print(2);
    
        

  

    }
}