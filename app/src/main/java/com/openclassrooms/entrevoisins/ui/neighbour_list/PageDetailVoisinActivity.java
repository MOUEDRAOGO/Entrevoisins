package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;

public class PageDetailVoisinActivity extends AppCompatActivity {
    public static final String MY_OBJECT_NEIGHBOUR = "myObjectNeighbour";
    private Neighbour selectedObject;
    private ImageView detailBackdropView;
    private ImageView detailImageView;
    private TextView detailTextView1;
    private TextView detailTextView2;
    private TextView detailTextView3;
    private TextView detailEditTextView;
    private TextView detailTextView4;
    private TextView detailTextView5;
    private TextView detailTextView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_detail_voisin);

        // parcelable = passer des donnees complexes d une activité a l'autre
        selectedObject = getIntent().getParcelableExtra(MY_OBJECT_NEIGHBOUR); // Parcelable ; getintent = recuperation des donnees

        //Recuperation de la vue
        final Intent intent = getIntent();

        detailBackdropView = findViewById(R.id.detailBackdrop);
        //remplissage de la vue selectionnee avec la bonne data provenant de l'objet
        detailBackdropView.setImageDrawable(selectedObject.getAvatarUrl()); //icon

        detailImageView = findViewById(R.id.detailImage);
        //remplissage de la vue selectionnee avec la bonne data provenant de l'objet
        detailImageView.setImageDrawable(selectedObject.getAvatarUrl());

        detailTextView1 = findViewById(R.id.detailText1);
        detailTextView1.setText(selectedObject.getName());

        detailTextView2 = findViewById(R.id.detailText2);
        detailTextView2.setText(selectedObject.getName());

        detailTextView3 = findViewById(R.id.detailText3);
        detailTextView3.setText(selectedObject.getAddress());

        detailEditTextView = findViewById(R.id.detailEditText);
        detailEditTextView.setText(selectedObject.getPhoneNumber());

        detailTextView4 = findViewById(R.id.detailText4);
        //detailTextView4.setText(selectedObject.get()); //facebook

        detailTextView5 = findViewById(R.id.detailText5);
        detailTextView5.setText(selectedObject.getAboutMe());

        detailTextView5 = findViewById(R.id.detailText5);
        detailTextView5.setText(selectedObject.getAboutMe()); //text



    }
}
