package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;

public class PageDetailVoisinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_detail_voisin);

        //Recuperation de la vue
        final Intent intent = getIntent();
        View pageDetailVoisinView = (TextView) findViewById(R.id.activity_page_detail_voisin);
        //remplissage de la vue selectionnee avec la bonne data provenant de l'objet
        pageDetailVoisinView.setText(neighbour.getId());
    }
}
