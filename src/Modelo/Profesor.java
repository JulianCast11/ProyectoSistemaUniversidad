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
public class Profesor {
    
    private String codigo;
    private String nombre;
    private String titulo;
    private Departamento departamento;

    public Profesor(String codigo, String nombre, String titulo, Departamento departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "codigo=" + codigo + ", nombre=" + nombre + ", titulo=" + titulo + ", departamento=" + departamento + '}';
    }
    
    
    
}
