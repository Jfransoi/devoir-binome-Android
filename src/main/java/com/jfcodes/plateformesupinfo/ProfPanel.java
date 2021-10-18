package com.jfcodes.plateformesupinfo;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jfcodes.plateformesupinfo.ProgrameHelperClasses.adapterprogram;
import com.jfcodes.plateformesupinfo.ProgrameHelperClasses.programspecs;

import java.util.ArrayList;

public class ProfPanel extends AppCompatActivity implements adapterprogram.ListItemClickListener {

    RecyclerView programRecycler;
    RecyclerView.Adapter adapterprogam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_panel);
        getSupportActionBar().hide();

        //programmes
        programRecycler = findViewById(R.id.programme_recycler); // programme_recycler = id du recycler view contenant les cards
        programRecycler();


    }

    private void programRecycler() {
        //fonds de cards
        GradientDrawable gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        GradientDrawable gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        GradientDrawable gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});

        programRecycler.setHasFixedSize(true);
        programRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        ArrayList<programspecs> programlocation = new ArrayList<>();
        programlocation.add(new programspecs(gradient1, "Groupe : PR-123", "Lundi : 8h - 13h \nMercredi : 9h - 14h \nVendredi: 15h - 19h "));
        programlocation.add(new programspecs(gradient2, "Groupe : PR-456", "Lundi : 8h - 13h \nMercredi : 9h - 14h \nVendredi: 15h - 19h "));
        programlocation.add(new programspecs(gradient3, "Groupe : PR-789", "Lundi : 8h - 13h \nMercredi : 9h - 14h \nVendredi: 15h - 19h "));

        adapterprogam = new adapterprogram(programlocation, this);
        programRecycler.setAdapter(adapterprogam);
    }

    @Override
    public void onprogListClick(int clickedItemIndex) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}