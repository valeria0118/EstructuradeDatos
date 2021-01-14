package sample.Estructuras;

import javafx.beans.property.SimpleStringProperty;

public class Pedido {
    SimpleStringProperty bebida;
    SimpleStringProperty cantidadBebida;
    SimpleStringProperty postre;
    SimpleStringProperty cantidadPostre;

    public Pedido(String bebida, String cantB,String postre,String cantPos){
        this.bebida=new SimpleStringProperty(bebida);
        this.cantidadBebida=new SimpleStringProperty(cantB);
        this.postre=new SimpleStringProperty(postre);
        this.cantidadPostre=new SimpleStringProperty(cantPos);
    }

    public String getBebida() {
        return bebida.get();
    }

    public SimpleStringProperty bebidaProperty() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida.set(bebida);
    }

    public String getCantidadBebida() {
        return cantidadBebida.get();
    }

    public SimpleStringProperty cantidadBebidaProperty() {
        return cantidadBebida;
    }

    public void setCantidadBebida(String cantidadBebida) {
        this.cantidadBebida.set(cantidadBebida);
    }

    public String getPostre() {
        return postre.get();
    }

    public SimpleStringProperty postreProperty() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre.set(postre);
    }

    public String getCantidadPostre() {
        return cantidadPostre.get();
    }

    public SimpleStringProperty cantidadPostreProperty() {
        return cantidadPostre;
    }

    public void setCantidadPostre(String cantidadPostre) {
        this.cantidadPostre.set(cantidadPostre);
    }
}
