package com.example.viewpagerdemo.Main;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.viewpagerdemo.Adapter.ViewPagerServiceAdapter;
import com.example.viewpagerdemo.Fragment.OnServiceFragment;
import com.example.viewpagerdemo.Fragment.SuggesFragment;
import com.example.viewpagerdemo.Fragment.WarningFragment;
import com.example.viewpagerdemo.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager vpService;
    ArrayList<Fragment> data = new ArrayList<>();
    TabLayout tabService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        prepareViewPager();
    }
    void init(){
        vpService = findViewById(R.id.vp_services);
        tabService = findViewById(R.id.tab_service);
        OnServiceFragment onServiceFragment = new OnServiceFragment();
        SuggesFragment suggesFragment = new SuggesFragment();
        WarningFragment warningFragment = new WarningFragment();
        data.add(onServiceFragment);
        data.add(suggesFragment);
        data.add(warningFragment);
    }
    void prepareViewPager(){
        ViewPagerServiceAdapter adapter = new ViewPagerServiceAdapter(
                getSupportFragmentManager(),this, data
        );
        vpService.setAdapter(adapter);
        tabService.setupWithViewPager(vpService);

    }

}
