package com.example.grupobecm8.drawer.detalles.presenters;

import com.example.grupobecm8.drawer.detalles.interactors.DetallesInteractor;
import com.example.grupobecm8.drawer.detalles.interfaces.DetallesInterfaces;
import com.example.grupobecm8.drawer.detalles.interfaces.DetallesInterfaces;
import com.example.grupobecm8.drawer.model.Post;

/**
 * Created by Grupo BECM 8 on 21/02/2017.
 */

public class DetallesPresenter implements DetallesInterfaces.IDetallesPresenter, DetallesInterfaces.IDetallesListener {
    DetallesInterfaces.IDetallesView view;
    DetallesInterfaces.IDetallesInteractor interactor;

    public DetallesPresenter(DetallesInterfaces.IDetallesView view) {
        this.view = view;
        interactor = new DetallesInteractor(this);
    }

    @Override
    public void onPostReady(Post post) {
        view.setData(post);
    }

    @Override
    public void requestPost(int num) {
        interactor.getPost(num);
    }
}
