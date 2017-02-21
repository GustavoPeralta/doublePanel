package com.example.grupobecm8.drawer.detalles.interfaces;

import com.example.grupobecm8.drawer.model.Post;

/**
 * Created by Grupo BECM 8 on 21/02/2017.
 */

public interface DetallesInterfaces {

    interface IDetallesView {
        void setData(Post post);
    }

    interface IDetallesPresenter {
        void requestPost(int num);
    }

    interface IDetallesListener {
        void onPostReady(Post post);
    }

    interface IDetallesInteractor {
        void getPost(int num);
    }

}
