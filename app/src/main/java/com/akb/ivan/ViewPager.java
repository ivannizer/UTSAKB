package com.akb.ivan;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

import com.akb.ivan.fragments.PageFragment1;
import com.akb.ivan.fragments.PageFragment2;
import com.akb.ivan.fragments.PageFragment3;

import java.util.ArrayList;
import java.util.List;

public class ViewPager extends AppCompatActivity {

    //Tanggal Pengerjaan : 11-5-2020
    //NIM : 10117154
    //Nama: Andi Muhammad Ivan M
    //Kelas : IF-4

    private androidx.viewpager.widget.ViewPager pager;
    private PagerAdapter pagerAdapter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());

        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);

        pager.setAdapter(pagerAdapter);

    }
}
