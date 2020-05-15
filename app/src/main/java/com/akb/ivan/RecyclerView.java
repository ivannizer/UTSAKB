package com.akb.ivan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    //Tanggal Pengerjaan : 11-5-2020
    //NIM : 10117154
    //Nama: Andi Muhammad Ivan M
    //Kelas : IF-4

    private androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;

    public RecyclerView() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_daily);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.note, "Line 1", "Line2"));
        exampleList.add(new ExampleItem(R.drawable.note, "Line 3", "Line4"));
        exampleList.add(new ExampleItem(R.drawable.note, "Line 5", "Line6"));

    }


}
