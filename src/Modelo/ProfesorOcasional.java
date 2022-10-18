/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author RYZEN 5
 */
public class ProfesorOcasional extends Profesor{
    
    private double salario_basico;


    public ProfesorOcasional(double salario_basico, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salario_basico = salario_basico;
    }

    public double getSalario_basico() {
        return salario_basico;
    }

    public void setSalario_basico(double salario_basico) {
        this.salario_basico = salario_basico;
    }
    
    
    
}
