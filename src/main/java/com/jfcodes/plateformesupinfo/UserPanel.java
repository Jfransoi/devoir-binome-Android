package com.jfcodes.plateformesupinfo;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jfcodes.plateformesupinfo.FilesHelperClasses.adapterfiles;
import com.jfcodes.plateformesupinfo.FilesHelperClasses.filespecs;
import com.jfcodes.plateformesupinfo.MatiereHelperClasses.adaptermatiere;
import com.jfcodes.plateformesupinfo.MatiereHelperClasses.matierespecs;

import java.util.ArrayList;

public class UserPanel extends AppCompatActivity implements adaptermatiere.ListItemClickListener, adapterfiles.ListItemClickListener {

    RecyclerView matiereRecycler, filesRecycler;
    RecyclerView.Adapter adapter, filesadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_panel);
        getSupportActionBar().hide();

        //matières
        matiereRecycler = findViewById(R.id.matiere_recycler); // matiere_recycler = id recycler view contenant les cards
        matiereRecycler();
        // Fichiers
        filesRecycler = findViewById(R.id.files_recycler);
        filesRecycler();

        }

    private void filesRecycler() {

        //fonds de cards
        GradientDrawable gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        GradientDrawable gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        GradientDrawable gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});

        filesRecycler.setHasFixedSize(true);
        filesRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        ArrayList<filespecs> fileslocation = new ArrayList<>();
        fileslocation.add(new filespecs(gradient1, "Introduction Java", "65 pages - 125 kb"));
        fileslocation.add(new filespecs(gradient1, "Demarche Qualité", "100 pages - 265 kb"));
        fileslocation.add(new filespecs(gradient1, "Cour Python", "50 pages - 100 kb"));

        filesadapter = new adapterfiles(fileslocation, this);
        filesRecycler.setAdapter(filesadapter);

    }


    private void matiereRecycler() {

        //fonds de cards
        GradientDrawable gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        GradientDrawable gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        GradientDrawable gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});

        matiereRecycler.setHasFixedSize(true);
        matiereRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<matierespecs> matierelocation = new ArrayList<>();
        matierelocation.add(new matierespecs(gradient1, "PHP - Sécurité", "Detail 123   ABCd \\nDetail 123   ABCd \\nDetail 123   ABCd "));
        matierelocation.add(new matierespecs(gradient2, "HTML - CSS", "Detail 123   ABCd \\nDetail 123   ABCd \\nDetail 123   ABCd "));
        matierelocation.add(new matierespecs(gradient3, "JavaScript", "Detail 123   ABCd \\nDetail 123   ABCd \\nDetail 123   ABCd "));
        matierelocation.add(new matierespecs(gradient4, "Python", "Detail 123   ABCd \\nDetail 123   ABCd \\nDetail 123   ABCd "));

        adapter = new adaptermatiere(matierelocation,this);
        matiereRecycler.setAdapter(adapter);

    }

        @Override
        public void onmatiereListClick(int clickedItemIndex) {

    }

        @Override
        public void onfileListClick(int clickedItemIndex) {

    }
}
