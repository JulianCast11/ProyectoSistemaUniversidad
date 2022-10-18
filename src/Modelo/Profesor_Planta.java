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
public class Profesor_Planta extends Profesor{
    
    private double salarioBasico=650000;
    private double puntosSalariales=30;
    private double valorPunto;
    private String categoria;
    private String numResNomb;
    private String fechNomNacimient;
    double vp;

    public Profesor_Planta(double salarioBasico, double puntosSalariales, double valorPunto, String categoria, String numResNomb, String fechNomNacimient, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salarioBasico = salarioBasico;
        this.puntosSalariales = puntosSalariales;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.numResNomb = numResNomb;
        this.fechNomNacimient = fechNomNacimient;
    }

    public double getSalario_basico() {
        return salarioBasico;
    }

    public void setSalario_basico(double salario_basico) {
        this.salarioBasico = salarioBasico;
    }

    public double getPuntos_salariales() {
        return puntosSalariales;
    }

    public void setPuntos_salariales(double puntos_salariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public double getValor_punto() {
        return valorPunto;
    }

    public void setValor_punto(double valor_punto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNum_res_nomb() {
        return numResNomb;
    }

    public void setNum_res_nomb(String num_res_nomb) {
        this.numResNomb = num_res_nomb;
    }

    public String getFecha_nombramiento() {
        return fechNomNacimient;
    }

    public void setFecha_nombramiento(String fecha_nombramiento) {
        this.fechNomNacimient = fechNomNacimient;
    }
    
    
    public void calcular_Salario(double valorPunto){
        
        double calcularSalario;
        
        calcularSalario= getSalario_basico() + (getPuntos_salariales()*valorPunto );
        System.out.println(calcularSalario);
    }
    
    /*public static void main(String args []){
        
        Profesor_Planta p = new Profesor_Planta();
        
        p.calcular_Salario(2000);
        
    }*/
    
}
