package com.example.grupobecm8.drawer.detalles.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.grupobecm8.drawer.R;
import com.example.grupobecm8.drawer.detalles.interfaces.DetallesInterfaces;
import com.example.grupobecm8.drawer.detalles.presenters.DetallesPresenter;
import com.example.grupobecm8.drawer.lista.presenters.NameAdapter;
import com.example.grupobecm8.drawer.model.Post;

/**
 * Created by Grupo BECM 8 on 21/02/2017.
 */

public class DetallesActivity extends AppCompatActivity implements DetallesInterfaces.IDetallesView {

    private TextView title;
    private TextView subtitle;
    private TextView body;

    public static final String NUM = "num";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_detalles);

        title = (TextView) findViewById(R.id.postTitle);
        subtitle = (TextView) findViewById(R.id.postSubtitle);
        body = (TextView) findViewById(R.id.postBody);

        DetallesInterfaces.IDetallesPresenter presenter = new DetallesPresenter(this);
        presenter.requestPost(getIntent().getIntExtra(NUM,0));
    }

    @Override
    public void setData(Post post) {
        title.setText(post.getTitle());
        subtitle.setText(post.getSubtitle());
        body.setText(post.getBody());
    }

}
