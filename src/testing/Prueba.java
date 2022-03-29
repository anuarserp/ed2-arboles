package testing;

import arboles.Arbin;
import arboles.ArbolInteger;

public class Prueba {

    public static void main(String[] args) {
        ArbolInteger arbolEnteros = new ArbolInteger();

        Arbin<Integer> raiz = arbolEnteros.crear();
        System.out.println("Peso es: "+arbolEnteros.peso(raiz));

        arbolEnteros.preorden(raiz);

    }
}
