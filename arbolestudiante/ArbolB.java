package arbolestudiante;

public class ArbolB {
    private Nodo raiz;

    public ArbolB() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(final Nodo raiz) {
        this.raiz = raiz;
    }

    public boolean Vacia() {
        return raiz == null;
    }

    public void Insertar(final Estudiante estudiante) {
        final Nodo nuevo = new Nodo(estudiante);
        int agg = 0;
        if (Vacia()) {
            raiz = nuevo;
            System.out.println("se agregó a la raiz");
        } else {
            Nodo aux = raiz;
            Nodo padre;
            while (true) {
                padre = aux;
                agg = aux.getEstudiante().getCodigo();
              //  System.out.println("el "+estudiante.getCodigo() +" es menor que "+aux.getEstudiante().getCodigo() );
                if (estudiante.getCodigo() < aux.getEstudiante().getCodigo()) {

                    aux = aux.getIzq();
                    if (aux == null) {
                        padre.setIzq(nuevo);
                        System.out.println("se agregó a la izquierda del " + agg);
                        return;
                    }
                } else {
                    aux = aux.getDer();
                    if (aux == null) {
                        padre.setDer(nuevo);
                        System.out.println("se agregó a la derecha del " + agg);
                        return;
                    }
                }
                if (estudiante.getCodigo() == aux.getEstudiante().getCodigo()) {
                    return;
                }
            }
        }
    }

    // INORDEN-IRD
    // Metodo para mostar de menor a mayor
    public void InOrden(final Nodo r) {
        if (Vacia()) {
            System.out.println("No hay arbol creado");
        } else {
            if (r != null) {
                InOrden(r.getIzq());
                System.out.print(r.getEstudiante().toString());
                InOrden(r.getDer());

            }
        }

    }

    // Metodo para mostrar de mayor a menor
    public void InOrden2(final Nodo r) {
        if (Vacia()) {
            System.out.println("No hay arbol creado");
        } else {
            if (r != null) {
                InOrden2(r.getDer());
                System.out.print(r.getEstudiante().toString());
                InOrden2(r.getIzq());
            }
        }
    }

    public boolean Buscar(final Nodo r, final int codigo) {
        boolean busco = false;

        if (r != null) {
            Buscar(r.getIzq(), codigo);
            if (r.getEstudiante().getCodigo() == codigo) {
                System.out.println("Estudiante " + r.getEstudiante().getCodigo() + " Encontrado");
                System.out.println(r.getEstudiante().toString());
                busco = true;
            }
            Buscar(r.getDer(), codigo);
        }

        return busco;
    }

    public boolean EliminarEstudiante(final Nodo r, final int codigo) {
        boolean busco = false;

        if (r != null) {
            EliminarEstudiante(r.getIzq(), codigo);
            if (r.getEstudiante().getCodigo() == codigo) {
                Eliminar(r.getEstudiante());
                System.out.println("Estudiante " + r.getEstudiante().getCodigo() + " Eliminado Correctamente");
                busco = true;
            }
            EliminarEstudiante(r.getDer(), codigo);
        }
        return busco;
    }

    public boolean Eliminar(final Estudiante estudiante) {

        Nodo aux = raiz;
        Nodo padre = raiz;
        boolean hijoizquierdo = true;
        while (aux.getEstudiante().getCodigo() != estudiante.getCodigo()) {
            padre = aux;
            if (estudiante.getCodigo() > aux.getEstudiante().getCodigo()) {
                aux = aux.getDer();
                hijoizquierdo = false;
            } else {
                aux = aux.getIzq();
                hijoizquierdo = true;
            }
            if (aux == null) {
                return false;
            }

        }

        if (aux.getIzq() == null && aux.getDer() == null) {// si tiene dos hijos
            if (aux == raiz) {
                raiz = null;
            } else if (hijoizquierdo) {
                padre.setIzq(null);
            } else {
                padre.setDer(null);
            }
        } else if (aux.getDer() == null) {
            if (aux == raiz) {
                raiz = aux.getIzq();
            } else if (hijoizquierdo) {
                padre.setIzq(aux.getIzq());
            } else {
                padre.setDer(aux.getIzq());
            }
        } else if (aux.getIzq() == null) {
            if (aux == raiz) {
                raiz = aux.getDer();
            } else if (hijoizquierdo) {
                padre.setIzq(aux.getDer());
            } else {
                padre.setDer(aux.getDer());
            }
        } else {
            final Nodo reemplazo = obtenerReemplazo(aux);
            if (raiz == aux) {
                raiz = reemplazo;
            } else if (hijoizquierdo) {
                padre.setIzq(reemplazo);
            } else {
                padre.setDer(reemplazo);
            }
            reemplazo.setIzq(aux.getIzq());
        }
        return true;
    }

    public Nodo obtenerReemplazo(Nodo nodoreemplazo) {
        Nodo reemplazoPadre = nodoreemplazo;
        Nodo reemplazo = nodoreemplazo;
        Nodo aux = nodoreemplazo.getDer();
        while (aux != null) {
            reemplazoPadre = reemplazo;
            reemplazo = aux;
            aux = aux.getIzq();
        }
        if (reemplazo != nodoreemplazo.getDer()) {
            reemplazoPadre.setIzq(reemplazo.getDer());
            reemplazo.setDer(nodoreemplazo.getDer());
        }
        return reemplazo;
    }

    public void Reprobados(final Nodo r) {
        if (Vacia()) {
            System.out.println("No hay arbol creado");
        } else {
            if (r != null) {
                Reprobados(r.getIzq());
                if (r.getEstudiante().getNota() < 3.0) {
                    System.out.println("Estudiante " + r.getEstudiante().getNombre() + " reprobó con una nota de :"
                            + r.getEstudiante().getNota());
                }
                Reprobados(r.getDer());

            }
        }
    }

    public void Aprobados(final Nodo r) {
        if (Vacia()) {
            System.out.println("No hay arbol creado");
        } else {
            if (r != null) {
                Aprobados(r.getIzq());
                if (r.getEstudiante().getNota() >= 3.0) {
                    System.out.println("Estudiante " + r.getEstudiante().getNombre() + " Aprobó con una nota de: "
                            + r.getEstudiante().getNota());
                }
                Aprobados(r.getDer());
            }
        }
    }
}
