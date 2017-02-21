package com.example.grupobecm8.drawer.lista.presenters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.grupobecm8.drawer.lista.interactors.ListaInteractor;
import com.example.grupobecm8.drawer.lista.interfaces.ListaInterfaces;
import com.example.grupobecm8.drawer.lista.interfaces.ListaInterfaces;

import java.util.List;

/**
 * Created by Grupo BECM 8 on 20/02/2017.
 */

public class ListaPresenter implements ListaInterfaces.IListaListener, ListaInterfaces.IListaPresenter {

    ListaInterfaces.IListaInteractor interactor;
    ListaInterfaces.IListaView view;
    NameAdapter.ItemClickListener listener;

    public ListaPresenter(ListaInterfaces.IListaView view, NameAdapter.ItemClickListener listener) {
        this.view = view;
        this.listener = listener;
        interactor = new ListaInteractor(this);
    }

    //listener
    @Override
    public void onDataReceived(List<String> nombres) {
        view.setAdapter(new NameAdapter(nombres,listener));
    }

    //pesenter
    @Override
    public void requestData() {
        interactor.getNames();
    }
}
