package com.modelos;

public class Medico extends Persona{

    private String especialidad;

    public Medico(String nombre, String genero, String correo, String cel, String especialidad) {
        super(nombre, genero, correo, cel);
        this.especialidad=especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre(){
        return super.getNombre();
    }

    public String getGenero(){
        return super.getGenero();
    }

    public String getCel(){
        return super.getCel();
    }
    
}
