import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Estructuras.Busqueda;
import sample.Estructuras.ItemPedido;
import sample.Estructuras.Pedido;

import java.awt.event.ActionEvent;
import java.util.LinkedList;
import java.util.Queue;

public class ControllerCobro {
    @FXML ComboBox comboBebida,comboPostre;
    @FXML TableView tabla;
    @FXML TextField txtCantB,txtCantP,txtNombre,txtVenta;
    @FXML Label NombrePedido,lblVentas;
     int[] ventas=new int[5];

    LinkedList<String> listaBebida=new LinkedList<>();
    LinkedList<String> listaPostre=new LinkedList<>();
    TableColumn columnBebida=new TableColumn("Bebida");
    TableColumn columncantbebida=new TableColumn("Cantidad");
    TableColumn columnPostre=new TableColumn("Postre");
    TableColumn columncantpostre=new TableColumn("Cantidad");
    ObservableList<Pedido> listaPedidos= FXCollections.observableArrayList();
    Queue<ItemPedido> cola=new LinkedList<>();

    String[][] postres={
            {"Pastel","100"},
            {"Cupcakes","15"},
            {"Brownies","25"},
            {"Hotcakes","20"},
    };
    @FXML protected void initialize(){
        columnBebida.setCellValueFactory(new PropertyValueFactory<Pedido,String>("bebida"));
        columncantbebida.setCellValueFactory(new PropertyValueFactory<Pedido,String>("cantidadBebida"));
        columnPostre.setCellValueFactory(new PropertyValueFactory<Pedido,String>("postre"));
        columncantpostre.setCellValueFactory(new PropertyValueFactory<Pedido,String>("cantidadPostre"));
        tabla.getColumns().addAll(columnBebida,columncantbebida,columnPostre,columncantpostre);
        tabla.setItems(listaPedidos);

        listaBebida.add("licuado");
        listaBebida.add("leche");

       // listaPostre.add("cupcakes");
       // listaPostre.add("pastel");
        for (int x=0;x<postres.length;x++){
            listaPostre.add(postres[x][0]);
        }
        for (int x=0;x<listaPostre.size();x++) comboPostre.getItems().add(listaPostre.get(x));
        for (int x=0;x<listaBebida.size();x++) comboBebida.getItems().add(listaBebida.get(x));
        //comboBebida.getItems().add()
    }
    public void insertarPedido(ActionEvent event){
        String p=comboPostre.getSelectionModel().getSelectedItem().toString();
        String b=comboBebida.getSelectionModel().getSelectedItem().toString();
        String cb=txtCantB.getText();
        String cp=txtCantP.getText();
        listaPedidos.add(new Pedido(p,b,cb,cp));

    }
    public void guardarPedido(ActionEvent event){
        String[][] items=new String[listaPedidos.size()][4];
        for (int x=0;x<items.length;x++){
            items[x][0]=listaPedidos.get(x).getBebida();
            items[x][1]=listaPedidos.get(x).getCantidadBebida();
            items[x][2]=listaPedidos.get(x).getPostre();
            items[x][3]=listaPedidos.get(x).getCantidadPostre();
        }
        ItemPedido pedido=new ItemPedido(items,txtNombre.getText());
        cola.add(pedido);
        listaPedidos.clear();
        txtNombre.setText();
    }
    public void finalizar(){
        ItemPedido pedido=cola.poll();
        NombrePedido.setText(pedido.getNombre());
        String[][] datos=pedido.getDatos();
        for (int x=0;x<datos.length;x++);
        System.out.print(datos[x][0]);
        System.out.print(datos[x][1]);
        System.out.print(datos[x][2]);
        System.out.print(datos[x][3]);
        System.out.println();
    }
    int cont=0;
    public void insertarVenta(ActionEvent event){
        ventas[cont]=Integer.parseInt(txtVenta.getText().toString());
        System.out.println(txtVenta.getText());
        cont++;
    }
    public void ordenarVenta(ActionEvent event){
        Busqueda ordenar=new Busqueda();
        int[] ordenado=ordenar.burbuja(ventas);
        String todo="";
        for (int x=0;x<ordenado.length;x++)todo +=","+ ordenado[x];
        lblVentas.setText(todo);
    }
    public void ordenarPostres(ActionEvent event){
        Busqueda ordenar=new Busqueda();
        comboPostre.getItems().clear();
        listaPostre.clear();
        String[][] ordenado = ordenar.burbujaArray(postres);
        for (int x=0;x< ordenado=ordenado.length;x++){
            listaPostre.add(ordenado[x][0]);
            comboPostre.getItems().add(ordenado[x][0]);
        }
    }
    public void ordenarVentaInsercion(ActionEvent event) {
        Busqueda ordenar = new Busqueda();
        int[] ordenado = ordenar.insercionDirecta(ventas);
        String todo = "";
        for (int x = 0; x < ordenado.length; x++) todo += "," + ordenado[x];
        lblVentas.setText(todo);
    }

}

