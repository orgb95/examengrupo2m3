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

    int contador = 0;
    
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
        //Datos del pojo
        int id = contador++;
        String nombres = txtNombre.getText();
        String cedula = txtCedula.getText();
        int anio_contratacion = Integer.parseInt(txtFechaContratacion.getText());
        float salario = Float.parseFloat(txtSalario.getText());
        
        //Datos de la tabla
        float inss = calcular.inss(salario);
        float salarioAnual = calcular.salarioAnual(salario, inss);
        float ir = calcular.ir(salario, inss);
        float antiguedad = calcular.antiguedad(anio_contratacion);
        float salarioNeto = calcular.salarioNeto(salario, inss, ir);
        
        columnCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        columnInss.setCellValueFactory(new PropertyValueFactory<>("inss"));
        columnIR.setCellValueFactory(new PropertyValueFactory<>("ir"));
        columnAntiguedad.setCellValueFactory(new PropertyValueFactory<>("antiguedad"));
        columnSalarioNeto.setCellValueFactory(new PropertyValueFactory<>("salarioNeto"));
        
        
        
        tblViewEmpleados.getItems().add(new Empleado(id, nombres, cedula, anio_contratacion, salario, inss, ir, antiguedad, salarioNeto));
        
        
    }

    @FXML
    public void btnEliminarAction(ActionEvent event) {
        tblViewEmpleados.getItems().remove(tblViewEmpleados.getSelectionModel().getSelectedIndex());   
    }
    
}
