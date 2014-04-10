package com.fix;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

}

class MyAdapter extends FragmentStatePagerAdapter
{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
//        Log.d("VIVZ", "get Item is called "+i);
        if(i==0)
        {
            fragment=new FragmentA();
        }
        if(i==1)
        {
            fragment=new FragmentB();
        }
        if(i==2)
        {
            fragment=new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
//        Log.d("VIVZ", "get Count is called");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "About";
        }
        if(position==1)
        {
            return "Changelog";
        }
        if(position==2)
        {
            return "Credits";
        }
        return null;
    }
}