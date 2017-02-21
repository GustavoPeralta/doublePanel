package com.example.grupobecm8.drawer.lista.interactors;

import com.example.grupobecm8.drawer.lista.interfaces.ListaInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Grupo BECM 8 on 20/02/2017.
 */

public class ListaInteractor implements ListaInterfaces.IListaInteractor {
    ListaInterfaces.IListaListener listener;

    public ListaInteractor(ListaInterfaces.IListaListener listener) {
        this.listener = listener;
    }

    @Override
    public void getNames() {
        List<String> names = new ArrayList<>();
        for (int i=1;i<15;i++){
            names.add("Post "+i);
        }
        listener.onDataReceived(names);
    }
}
