/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.examen.core;

/**
 *
 * @author Sistemas-09
 */
public class calcular {
    public static float inss(float salario){
        return (float) (salario * (0.07));
    }
    
    public static float salarioAnual(float salario, float inss){
        return ((salario - inss)*12);
    }
    
//    public static float ir (float salarioAnual){
//     
//    }
}
