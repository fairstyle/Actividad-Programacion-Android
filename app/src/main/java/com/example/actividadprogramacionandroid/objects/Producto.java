package com.example.actividadprogramacionandroid.objects;

import java.util.Optional;
import java.util.UUID;

public class Producto {

    // ------------------------ VARS ------------------------
    private String _id;
    private String nombre;
    private Integer cantidad = 1;
    private Boolean estado = false;

    // ------------------------ CONSTRUCTOR ------------------------
    public Producto(String nombre){
        this.nombre = nombre;
        _id = UUID.randomUUID().toString();

    }

    // ------------------------ RETURN ------------------------
    public String getNombre(){
        return this.nombre;
    }
}
