class nodo:
    def _init_(self, Nombre=None, Cedula=None, sig=None):
        self.Nombre = Nombre
        self.Cedula = Cedula
        self.sig = sig

    def _str_(self):
        return "%s %s" %(self.Nombre, Cedula)

class lslista:
    def _init_(self):
        self.cabeza = None
        self.cola = None

    def agregar(self, elemento):
        if self.cabeza == None:
            self.cabeza == elemento

        if self.cola != None:
            self.cola.sig = elemento

        self.cola = elemento
    def listar(self):
        aux = self.cabeza
        while aux != None:
            print(aux)
            aux = aux.sig

if __name__ == "__main__":
    ls = lslista()

    while(True):
        print("---Menu---\n"+
        "1. Agregar \n"+
        "2. Listar")
        num = input("Ingrese un numero: ")
        if num == "1":
            Nombre = input("Ingrese el nombre: ")
            Cedula = input("Ingrese el Cedula: ")
            nod = nodo(Nombre, Cedula)
            ls.agregar(nod)
        elif num == "2":
            ls.listar()

            

      

   
 




