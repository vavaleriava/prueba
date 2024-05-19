/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package cajerodevaleria;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField Nombre;
    @FXML
    private TextField Numero;
    @FXML
    private TextField saldo;
    @FXML
    private Button IntroduceNum;
    @FXML
    private Button IntroduceSaldo;
    @FXML
    private Button IntroduceNombre;
    
    
    @FXML
    private Button IntroduceCuenta;
    private String nombre, numCuenta;
    private int dinero, operando;
    protected Cuenta cuenta;
    
    
    @FXML
    private Button btnRetirar;
    @FXML
    private TextField saldoActual;
    @FXML
    private TextField cantidad;
    @FXML
    private Button btnIngresar;
    @FXML
    private TextField cuentaTrabajo;
    
    
    private void handleButtonAction(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void CampoNumero(ActionEvent event) {
    }

    @FXML
    private void CampoSaldo(ActionEvent event) {
    }

    @FXML
    private void CampoNombre(ActionEvent event) {
    }

    @FXML
    private void btnRetirar(ActionEvent event) {
        operando = Integer.parseInt(cantidad.getText());
        dinero=dinero-operando;
        cuenta.setSaldo(dinero);
        System.out.println(cuenta.devolverInfoString());
        
        saldoActual.setText(String.valueOf(dinero));
    }


    @FXML
    private void operarCantidad(ActionEvent event) {
    }

    @FXML
    private void btnIngresar(ActionEvent event) {
        
        this.operando = Integer.parseInt(cantidad.getText());
        this.dinero=dinero+operando;
        this.cuenta.setSaldo(dinero);
        this.saldoActual.clear();
        this.saldoActual.setText(String.valueOf(dinero));
    }

    
    @FXML
    private void btnIntroduceNombre(ActionEvent event) {
        this.nombre= Nombre.getText();
        System.out.println("" + nombre);
    }

    @FXML
    private void btnIntroduceNum(ActionEvent event) {
        this.numCuenta=Numero.getText();
        System.out.println("" + numCuenta);
    }

    @FXML
    private void btnIntroduceSaldo(ActionEvent event) {
        this.dinero=Integer.parseInt(saldo.getText());
        System.out.println("" + dinero);
    }

    @FXML
    private void btnIntroduceCuenta(ActionEvent event) {
        cuenta = new Cuenta( nombre,  numCuenta,  dinero);
        System.out.println("Se ha abierto : " + cuenta.devolverInfoString());    
        saldoActual.appendText(String.valueOf(cuenta.getSaldo()));
        cuentaTrabajo.appendText(numCuenta);
    }
    
}
