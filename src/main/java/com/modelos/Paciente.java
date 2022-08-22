package com.modelos;

public class Paciente extends Persona{
    
    private String direccion;

    public Paciente(String nombre, String genero, String correo, String cel, String direccion) {
        super(nombre, genero, correo, cel);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
