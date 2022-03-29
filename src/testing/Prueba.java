package testing;

import arboles.Arbin;
import arboles.ArbolCaracteres;

public class Prueba {

    public static void main(String[] args) {
        ArbolCaracteres arbolEnteros = new ArbolCaracteres();

        Arbin<Integer> raiz = arbolEnteros.crear();
        System.out.println("Peso es: "+arbolEnteros.peso(raiz));

        arbolEnteros.inorden(raiz);

    }
}
