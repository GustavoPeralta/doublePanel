package com.example.grupobecm8.drawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.grupobecm8.drawer.detalles.views.DetallesActivity;
import com.example.grupobecm8.drawer.detalles.views.DetallesFragment;
import com.example.grupobecm8.drawer.lista.presenters.NameAdapter;
import com.example.grupobecm8.drawer.lista.views.ListaFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, NameAdapter.ItemClickListener{

    TextView txtSelect;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        txtSelect = (TextView) findViewById(R.id.txtSelect);

        ListaFragment listaFragment = (ListaFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLista);
        listaFragment.setClickListener(this);
        if (savedInstanceState!=null&&savedInstanceState.containsKey(DetallesActivity.NUM)){
            DetallesFragment detallesFragment = (DetallesFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetalle);
            num = savedInstanceState.getInt(DetallesActivity.NUM);
            if (detallesFragment != null){
                detallesFragment.selectPost(num);
                txtSelect.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Toast.makeText(this,"Camara",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(this,"Galeria",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_slideshow) {
            Toast.makeText(this,"Slider",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_manage) {
            Toast.makeText(this,"Herramientas",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(this,"Compartir",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
            Toast.makeText(this,"Enviar",Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(DetallesActivity.NUM,num);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onItemClick(int position) {
        num = position+1;
        DetallesFragment detallesFragment = (DetallesFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetalle);
        if (detallesFragment != null){
            detallesFragment.selectPost(position+1);
            txtSelect.setVisibility(View.GONE);
        }
        else {
            Intent intent = new Intent(this, DetallesActivity.class);
            intent.putExtra(DetallesActivity.NUM,position+1);
            startActivity(intent);
        }
    }

}
