public class tarea {

    
    protected Node first;

    
    public tarea() {
        first = null;
    }
//Insertar datos
    public void insert(Object o) {
        
      
        Node tmp = new Node(o, null);
      
        tmp.setNext(first);
    
        first = tmp;
    }

 
//mostrar posicion
    public void print(int n) {
       
        if (!isEmpty()) {
            Node tmp = first;

           
            for (int i = 0; i < n; i++) {
                tmp=tmp.getNext();
                if (tmp == null)
                    return; 
            }
            System.out.println(tmp.getInfo());
        }
    }
 //mostrar 
    public void print(){
       
        if (!isEmpty()) {
            Node tmp = first;
          
            while (tmp != null) {
                System.out.println(tmp.getInfo());
                tmp = tmp.getNext();
            }
        }
    }
//ver si está basio
    public boolean isEmpty() {
        if (first == null)
            return true;
        else 
            return false;
    }
}
