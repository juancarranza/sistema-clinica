package com.modelos;

public class Persona {
    
    private String nombre;
    private String genero;
    private String correo;
    private String cel;
    
    public Persona(String nombre, String genero, String correo, String cel) {
        this.nombre = nombre;
        this.genero = genero;
        this.correo = correo;
        this.cel = cel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }    
    
}
