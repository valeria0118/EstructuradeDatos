package sample.Estructuras;

public class ItemPedido {
    String[][] datos;
    String[][]nombre;

    public ItemPedido(String[][] datos, String[][] nombre) {
        this.datos = datos;
        this.nombre = nombre;
    }

    public String[][] getDatos() {
        return datos;
    }

    public void setDatos(String[][] datos) {
        this.datos = datos;
    }

    public String[][] getNombre() {
        return nombre;
    }

    public void setNombre(String[][] nombre) {
        this.nombre = nombre;
    }
}
