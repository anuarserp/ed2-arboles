package arboles;

public class ArbolInteger {

    public Arbin<Integer> crear() {
        Arbin<Integer> raiz = new ArbinCol<Integer>(2);

        Arbin<Integer> iz = new ArbinCol<Integer>(7);
        Arbin<Integer> dr = new ArbinCol<Integer>(5);

        Arbin<Integer> iz1 = new ArbinCol<Integer>(2);
        Arbin<Integer> dr2 = new ArbinCol<Integer>(4);

        raiz.enlIzq(iz);
        raiz.enlDer(dr);

        raiz.izq().enlDer(iz1);
        raiz.der().enlIzq(dr2);

        return raiz;
    }

    public int peso(Arbin<Integer> r) {
        if (r == null) return 0;

        return 1+peso(r.izq()) + peso(r.der());
    }

    public void preorden(Arbin<Integer> r) {
        if (r!= null) {
            System.out.println(r.obtener());
            preorden(r.izq());
            preorden(r.der());
        }
    }

    public void inorden(Arbin<Integer> r) {
        if (r!= null) {
            inorden(r.izq());
            System.out.println(r.obtener());
            inorden(r.der());
        }
    }

}
