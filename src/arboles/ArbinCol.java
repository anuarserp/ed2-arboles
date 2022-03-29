package arboles;

public class ArbinCol<E> implements Arbin<E> {
    private E dato;
    private Arbin<E> i;
    private Arbin<E> d;

    public ArbinCol(E dato) {
        this.dato = dato;
    }

    public Arbin<E> izq() {
        return i;
    }

    public Arbin<E> der() {
        return d;
    }

    public void enlIzq(Arbin<E> x) {
        i = x;
    }


    public void enlDer(Arbin<E> x) {
        d = x;
    }

    public E obtener() {
        return dato;
    }


    public void cambiar(E x) {
        dato = x;
    }

}
