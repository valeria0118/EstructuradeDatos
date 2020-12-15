package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    ObservableList peces= FXCollections.observableArrayList("trucha","carpa");
    @FXML Label lb1;
    @FXML Label lb2;
    @FXML Label lb3;
    @FXML ComboBox combo1;
    @FXML
    Button Binsertar;
    @FXML Button Bprocesar;


    @FXML
    TextField txtArreglo;
    @FXML
    ListView lista;
    public void procesar (ActionEvent event){
        int [] arreglo1=new int[2];



    }
}
