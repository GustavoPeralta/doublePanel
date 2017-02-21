package com.example.grupobecm8.drawer.detalles.interactors;

import com.example.grupobecm8.drawer.detalles.interfaces.DetallesInterfaces;
import com.example.grupobecm8.drawer.model.Post;

/**
 * Created by Grupo BECM 8 on 21/02/2017.
 */

public class DetallesInteractor implements DetallesInterfaces.IDetallesInteractor {

    DetallesInterfaces.IDetallesListener listener;

    public DetallesInteractor(DetallesInterfaces.IDetallesListener listener) {
        this.listener = listener;
    }

    @Override
    public void getPost(int num) {
        listener.onPostReady(new Post(num));
    }
}
