package com.example.actividadprogramacionandroid.objects;

public class EjemploProductos {

    private Lista _lista;

    private String[] _Listas = {"Lista de Compras", "Para Mañana", "Para el Auto"};
    private String[] _Productos = {
            "Platano", "Manzana", "Pera", // INSUMOS COMIDA
            "Chocolate Vicio", "Bom o Bom",
            "Neumatico", "Spray Silicona"// ARTICULOS PARA EL AUTO

            //"", // ACTIVIDADES // aun no disponible

    };

    // ------------------------ CONSTRUCTOR ------------------------
    public EjemploProductos(Lista listaGeneral){
        this._lista = listaGeneral;
        GenerarProductos();
        GenerarListas();
    }

    // ------------------------ NO RETURN ------------------------
    private void GenerarProductos(){
        Lista llenarListaDeProductos = (Lista)this._lista.getLista().get(0);
        for (String producto:_Productos) {
            llenarListaDeProductos.agregar(new Producto(producto));
        }
    }

    private void GenerarListas(){
        for (String lista:_Listas) {
            this._lista.agregar(new Lista(lista, 1));
        }
    }

    // ------------------------ RETURN ------------------------
    public Lista getListaGeneral(){
        return this._lista;
    }

}
