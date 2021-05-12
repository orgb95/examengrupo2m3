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
    
    public static float ir (float salario, float inss){
        float salarioAnualBruto = salario*12;
        float revisionTabla = (salarioAnualBruto  - inss);
        float ir = 0;
        
        if (revisionTabla > 0 && revisionTabla <= 100000 ) {
            ir = (salarioAnualBruto)/12;
        }else if(revisionTabla > 100000 && revisionTabla <= 200000){
            ir = (((salarioAnualBruto - 100000)*(15/100))+0)/12;
        }else if (revisionTabla >200000 && revisionTabla <= 350000){
            ir = (((salarioAnualBruto - 200000)*(20/100))+15000)/12;
        }else if (revisionTabla >350000 && revisionTabla <= 500000){
            ir = (((salarioAnualBruto - 350000)*(25/100))+45000)/12;
        }else if (revisionTabla >500000){
            ir = (((salarioAnualBruto - 500000)*(30/100))+82500)/12;
        }
        return ir;
    }
    
    public static float antiguedad(int anioContratacion){
        return 2021-anioContratacion;
    }
    
    public static float salarioNeto(float salario, float inss, float ir){
        return (salario- inss- ir);
    }
}
