package arboles;

public interface Arbin<E> {
    Arbin<E> izq();
    Arbin<E> der();

    void enlIzq(Arbin<E> x);
    void enlDer(Arbin<E> x);

    E obtener();
    void cambiar(E x);

}
