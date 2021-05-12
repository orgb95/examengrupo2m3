/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.examen.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import ni.edu.uni.fcys.programacion2.examen.pojo.Empleado;
import ni.edu.uni.fcys.programacion2.examen.core.calcular;

/**
 * FXML Controller class
 *
 * @author Sistemas-09
 */
public class MostrarFXMLController implements Initializable {

    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtApellidos;
    @FXML
    public TextField txtCedula;
    @FXML
    public TextField txtFechaContratacion;
    @FXML
    public TextField txtSalario;
    @FXML
    public TableView<Empleado> tblViewEmpleados;
    @FXML
    public TableColumn<Empleado, String> columnCedula;
    @FXML
    public TableColumn<Empleado, Float> columnInss;
    @FXML
    public TableColumn<Empleado, Float> columnIR;
    @FXML
    public TableColumn<Empleado, Float> columnAntiguedad;
    @FXML
    public TableColumn<Empleado, Float> columnSalarioNeto;
    @FXML
    public Button btnAgregar;
    @FXML
    public Button btnEliminar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void btnAgregarAction(ActionEvent event) {
        int id;
        String nombres = txtNombre.getText();
        String cedula = txtCedula.getText();
        String fecha_contratacion = txtFechaContratacion.getText();
        float salario = Float.parseFloat(txtSalario.getText());
        
        columnCedula.setCellValueFactory(new PropertyValueFactory<>("nombres"));
        
        
    }

    @FXML
    public void btnEliminarAction(ActionEvent event) {
    }
    
}
