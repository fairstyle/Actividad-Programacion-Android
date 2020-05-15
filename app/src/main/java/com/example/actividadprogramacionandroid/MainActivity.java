package com.example.actividadprogramacionandroid;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.example.actividadprogramacionandroid.objects.EjemploProductos;
import com.example.actividadprogramacionandroid.objects.Lista;
import com.example.actividadprogramacionandroid.objects.Producto;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    //Lista lista = (Lista)getApplicationContext();
    //private Lista listaGeneral = new Lista("Lista General", 0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.lista_uno, R.id.lista_dos, R.id.lista_tres, R.id.nueva_lista)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //System.out.println(lista.getLista().size());
        //INICIO MI APP
        /*listaGeneral.agregar(new Lista("Lista de Productos", 1));
        EjemploProductos Listaaux = new EjemploProductos(listaGeneral);
        listaGeneral = Listaaux.getListaGeneral();


        Lista prueba = (Lista)listaGeneral.getLista().get(0);

        prueba.getIndexOf("Bom o Bom");

        for(Object p: listaGeneral.getLista()){
            Lista li = (Lista) p;
            System.out.print("Lista: ");
            System.out.println(li.getNombre());

            for(Object n: li.getLista()){
                Producto pr = (Producto) n;
                System.out.print("Producto: ");
                System.out.println(pr.getNombre());
            }
        }*/
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

}
