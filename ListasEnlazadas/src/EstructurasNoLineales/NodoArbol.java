package EstructurasNoLineales;

public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzq;
    private NodoArbol nodoDerecho;
    public NodoArbol(int valor){
        this.valor=valor;
        this.nodoIzq=null;
        this.nodoDerecho=null;
    }

    public NodoArbol(int valor, NodoArbol nodoIzq, NodoArbol nodoDerecho) {
        this.valor = valor;
        this.nodoIzq = nodoIzq;
        this.nodoDerecho = nodoDerecho;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }
    public void insertar(int valor){
        if (valor<this.valor){
            //insertar en lado izq
            if (this.nodoIzq==null){
                this.nodoIzq=new NodoArbol(valor);
            }else {
                this.nodoIzq.insertar(valor);
            }
        }else {
            //insertar en lado derecho
            if (this.nodoDerecho==null){
                this.nodoDerecho=new NodoArbol(valor);
            }else {
                this.nodoDerecho.insertar(valor);
            }
        }
    }
}
