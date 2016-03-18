package cn.wzl.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(fragment1==null) {
            fragment1 = new Fragment1();
        }
        fragmentTransaction.replace(R.id.fragment_contain, fragment1);
        fragmentTransaction.commit();
    }

    public void onBtn1Click(View v) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(fragment1==null) {
            fragment1 = new Fragment1();
        }
        fragmentTransaction.replace(R.id.fragment_contain,fragment1);
        fragmentTransaction.commit();
    }

    public void onBtn2Click(View v) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(fragment2==null) {
            fragment2 = new Fragment2();
        }
        fragmentTransaction.replace(R.id.fragment_contain,fragment2);
        fragmentTransaction.commit();
    }

    public void onBtn3Click(View v) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(fragment3==null) {
            fragment3 = new Fragment3();
        }
        fragmentTransaction.replace(R.id.fragment_contain,fragment3);
        fragmentTransaction.commit();
    }

}
