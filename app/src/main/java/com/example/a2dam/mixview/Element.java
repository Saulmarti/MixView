package com.example.a2dam.mixview;

import android.widget.RatingBar;

/**
 * Created by 2dam on 28/11/2017.
 */

public class Element {
    private String nombre,direccion;
    private float puntiacio,precio;
    private int imagen;

    public Element(String nombre, String direccion, float puntiacio, float precio, int imagen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puntiacio = puntiacio;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPuntiacio() {
        return puntiacio;
    }

    public void setPuntiacio(float puntiacio) {
        this.puntiacio = puntiacio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
