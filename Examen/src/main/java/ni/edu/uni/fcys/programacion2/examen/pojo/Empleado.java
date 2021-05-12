/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.examen.pojo;

/**
 *
 * @author Sistemas-09
 */
public class Empleado {
    private int id;
    private String nombres;
    private String cedula;
    private String fecha_contratacion;
    private float salario;

    public Empleado() {
    }

    public Empleado(int id, String nombres, String cedula, String fecha_contratacion, float salario) {
        this.id = id;
        this.nombres = nombres;
        this.cedula = cedula;
        this.fecha_contratacion = fecha_contratacion;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(String fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
