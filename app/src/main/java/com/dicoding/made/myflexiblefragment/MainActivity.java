package com.dicoding.made.myflexiblefragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dev branch
        //Jp Branch
        //xxx
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        HomeFragment mHomeFragment = new HomeFragment();
        mFragmentTransaction.add(R.id.frame_container, mHomeFragment, HomeFragment.class.getSimpleName());

        Log.d("MyFlexibleFragment", "Fragment Name : "+HomeFragment.class.getSimpleName());
        mFragmentTransaction.commit();
    }
}
