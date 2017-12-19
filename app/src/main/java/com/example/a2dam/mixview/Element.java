package com.example.a2dam.mixview;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RatingBar;

/**
 * Created by 2dam on 28/11/2017.
 */

public class Element implements Parcelable {
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

    protected Element(Parcel in) {
        imagen = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagen);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Element> CREATOR = new Parcelable.Creator<Element>() {
        @Override
        public Element createFromParcel(Parcel in) {
            return new Element(in);
        }

        @Override
        public Element[] newArray(int size) {
            return new Element[size];
        }
    };
}