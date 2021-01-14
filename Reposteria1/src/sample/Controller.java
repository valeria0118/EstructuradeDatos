package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class Controller {
    @FXML TextField txtUsuario;
    @FXML PasswordField txtPassword;

    public void login (ActionEvent event){
        ingresare();
        String u=txtUsuario.getText();
        String t=txtPassword.getText();
        if (u.equals("valeria")&& t.equals("123")){
            try {
                Parent root = FXMLLoader.load(getClass().getResource("PantallaCobro.fxml"));
                Scene scene=new Scene(root);
                Main.stage.setScene(scene);
                Main.stage.setMaximized(true);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Restaurar");
            alert.setContentText("Datos incorrectos");
            alert.show();
        }

    }
    public void enter(KeyEvent event){
        if (event.getCode()== KeyCode.ENTER){
            ingresare();

        }
    }
    public void ingresare(){
        String u=txtUsuario.getText();
        String t=txtPassword.getText();
        if (u.equals("valeria")&& t.equals("123")){
            try {
                Parent root = FXMLLoader.load(getClass().getResource("PantallaCobro.fxml"));
                Scene scene=new Scene(root);
                Main.stage.setScene(scene);
                Main.stage.setMaximized(true);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Restaurar");
            alert.setContentText("Datos incorrectos");
            alert.show();
        }

    }
}
