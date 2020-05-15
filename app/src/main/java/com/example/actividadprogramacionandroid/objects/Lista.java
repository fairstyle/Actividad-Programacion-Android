package com.example.actividadprogramacionandroid.objects;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Lista extends Application {

    // ------------------------ VARS ------------------------
    private String _id;
    private String nombre;
    // 0 Contiene Listas
    // 1 Contiene Productos
    private int containList;
    // Lista contenedora
    private List listade;

    // ------------------------ CONSTRUCTOR ------------------------
    public Lista(String nombre, int containList){
        this.nombre = nombre;
        this.containList = containList;
        _id = UUID.randomUUID().toString();

        if(containList == 0){
            listade = new ArrayList<Lista>();
        }else if(containList == 1){
            listade = new ArrayList<Producto>();
        }
    }

    // ------------------------ NO RETURN ------------------------
    public Boolean agregar(Producto producto) {
        if(contieneProductos()){
            listade.add(producto);
            return true;
        }
        return false;
    }

    public Boolean agregar(Lista lista) {
        if(contieneListas()){
            listade.add(lista);
            return true;
        }
        return false;
    }


    // ------------------------ RETURN ------------------------
    public String getNombre(){
        return this.nombre;
    }

    public List getLista(){
        return listade;
    }

    public Boolean contieneListas(){
        return this.containList == 0 ? true:false;
    }

    public Boolean contieneProductos(){
        return this.containList == 1 ? true:false;
    }

    public Integer getIndexOf(String nombre){
        if(contieneProductos()){
            for(Object obj: listade){
                Producto prod = (Producto) obj;

                if(prod.getNombre().equals(nombre))
                    return listade.indexOf(obj);

            }
        }
        return -1;
    }

}
