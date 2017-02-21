package com.example.grupobecm8.drawer.lista.interfaces;

import android.support.v7.widget.RecyclerView;

import com.example.grupobecm8.drawer.lista.presenters.NameAdapter;

import java.util.List;

/**
 * Created by Grupo BECM 8 on 20/02/2017.
 */

public interface ListaInterfaces {

    interface IListaView {
        void setAdapter(NameAdapter adapter);
    }

    interface IListaPresenter {
        void requestData();
    }

    interface IListaListener {
        void onDataReceived(List<String> nombres);
    }

    interface IListaInteractor {
        void getNames();
    }

}
