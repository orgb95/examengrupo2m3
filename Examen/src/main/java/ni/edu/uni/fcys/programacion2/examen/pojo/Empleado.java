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
    private int anio_contratacion;
    private float salario;
    private float inss;
    private float ir;
    private float antiguedad;
    private float salarioNeto;

    public Empleado() {
    }

    public Empleado(int id, String nombres, String cedula, int anio_contratacion, float salario, float inss, float ir, float antiguedad, float salarioNeto) {
        this.id = id;
        this.nombres = nombres;
        this.cedula = cedula;
        this.anio_contratacion = anio_contratacion;
        this.salario = salario;
        this.inss = inss;
        this.ir = ir;
        this.antiguedad = antiguedad;
        this.salarioNeto = salarioNeto;
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

    public int getAnio_contratacion() {
        return anio_contratacion;
    }

    public void setAnio_contratacion(int anio_contratacion) {
        this.anio_contratacion = anio_contratacion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public float getIr() {
        return ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }

    public float getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(float antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(float salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    
}
