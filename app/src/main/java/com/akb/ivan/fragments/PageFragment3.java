package com.akb.ivan.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.akb.ivan.R;

public class PageFragment3 extends Fragment {

    //Tanggal Pengerjaan : 11-5-2020
    //NIM : 10117154
    //Nama: Andi Muhammad Ivan M
    //Kelas : IF-4

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.
                inflate(R.layout.page_3,container,
                        false);
        return rootView;


    }
}
