package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField txtEdad;
    @FXML
    Label lblTitulo;

    public void evento1(ActionEvent event){
        Conversion td=new Conversion();
        int numero = Integer.parseInt(txtEdad.getText());
        String res =td.binario(numero);
        lblTitulo.setText(res);
    }
}
