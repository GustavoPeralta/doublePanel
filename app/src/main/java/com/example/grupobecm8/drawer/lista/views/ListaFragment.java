package com.example.grupobecm8.drawer.lista.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grupobecm8.drawer.R;
import com.example.grupobecm8.drawer.lista.interfaces.ListaInterfaces;
import com.example.grupobecm8.drawer.lista.presenters.ListaPresenter;
import com.example.grupobecm8.drawer.lista.presenters.NameAdapter;

/**
 * Created by Grupo BECM 8 on 20/02/2017.
 */

public class ListaFragment extends Fragment implements ListaInterfaces.IListaView{

    private RecyclerView lista;
    ListaInterfaces.IListaPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);
        lista = (RecyclerView) view.findViewById(R.id.lista);
        lista.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void setAdapter(NameAdapter adapter) {
        lista.setAdapter(adapter);
    }

    public void setClickListener(NameAdapter.ItemClickListener listener){
        presenter = new ListaPresenter(this,listener);
        presenter.requestData();
    }

}
