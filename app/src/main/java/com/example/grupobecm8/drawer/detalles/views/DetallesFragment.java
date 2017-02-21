package com.example.grupobecm8.drawer.detalles.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.grupobecm8.drawer.R;
import com.example.grupobecm8.drawer.detalles.interfaces.DetallesInterfaces;
import com.example.grupobecm8.drawer.detalles.presenters.DetallesPresenter;
import com.example.grupobecm8.drawer.model.Post;

/**
 * Created by Grupo BECM 8 on 21/02/2017.
 */

public class DetallesFragment extends Fragment implements DetallesInterfaces.IDetallesView {

    TextView title;
    TextView subtitle;
    TextView body;

    DetallesInterfaces.IDetallesPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalles,container,false);

        title = (TextView) view.findViewById(R.id.postTitle);
        subtitle = (TextView) view.findViewById(R.id.postSubtitle);
        body = (TextView) view.findViewById(R.id.postBody);

        presenter = new DetallesPresenter(this);

        return view;
    }


    @SuppressWarnings("deprecation")
    @Override
    public void setData(Post post) {
        title.setText(post.getTitle());
        subtitle.setText(post.getSubtitle());
        body.setText(post.getBody());
    }

    public void selectPost(int num){
        presenter.requestPost(num);
    }

}
