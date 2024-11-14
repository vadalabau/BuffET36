package com.mycompany.buffet.modelo;

public class Usuario {
    private int id; // id del usuario
    private String nombre;
    private String contraseña;
    private boolean esAdmin;


    public Usuario(String nombre, String contraseña, boolean esAdmin) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.esAdmin = esAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() { // Aseg�rate de tener este m�todo
        return contraseña;
    }

    public boolean esAdmin() {
        return esAdmin;
    }
    
    public int getId() {
        return id;
    }
}