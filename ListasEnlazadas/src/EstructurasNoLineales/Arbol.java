package EstructurasNoLineales;

public class Arbol {
    NodoArbol inicial;
    public Arbol(){
        this.inicial=null;
    }
    public void insertar(int valor){
        if (this.inicial==null){
            this.inicial=new NodoArbol(valor);
        }else {
            this.inicial.insertar(valor);
        }
    }
    public void dispararPreorden(){
        this.preorden(this.inicial);
    }
    public void preorden(NodoArbol nodo){
        if (nodo==null){
            return; //detener recursividad caso base
        }else{
            System.out.print(nodo.getValor()+", ");
            preorden(nodo.getNodoDerecho());
            preorden(nodo.getNodoIzq());
        }
    }
    public void disparaInorden(){
        this.inorden(this.inicial);
    }
    public void inorden(NodoArbol nodo){
        if (nodo==null){
            return; //detener recursividad caso base
        }else{
            inorden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+", ");
            inorden(nodo.getNodoIzq());
        }
    }
    public void disparaPostorden(){
        this.postorden(this.inicial);
    }
    public void postorden(NodoArbol nodo){
        if (nodo==null){
            return; //detener recursividad caso base
        }else{
            postorden(nodo.getNodoDerecho());
            postorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor()+", ");
        }
    }
}
