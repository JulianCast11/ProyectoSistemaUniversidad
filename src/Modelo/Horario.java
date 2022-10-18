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
public class Horario {
    
    private String hora_in;
    private String hora_fin;
    private String salon;

    public Horario(String hora_in, String hora_fin, String salon) {
        this.hora_in = hora_in;
        this.hora_fin = hora_fin;
        this.salon = salon;
    }

    public String getHora_in() {
        return hora_in;
    }

    public void setHora_in(String hora_in) {
        this.hora_in = hora_in;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Horario{" + "hora_in=" + hora_in + ", hora_fin=" + hora_fin + ", salon=" + salon + '}';
    }
    
    
    
}
