package com.fix;



import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zoldyck
 */
public class FragmentA extends Fragment {
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("Zoldyck","onAttach");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null)
        {
            Log.d("Zoldyck","onCreate FIRST TIME");
        }
        else
        {
            Log.d("Zoldyck","onCreate SUBSEQUENT TIME");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        Log.d("Zoldyck","onCreateView");
        return inflater.inflate(R.layout.about, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Zoldyck","onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Zoldyck","onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Zoldyck","onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Zoldyck","onPause");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Zoldyck","onSaveInstanceState");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Zoldyck","onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Zoldyck","onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Zoldyck","onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Zoldyck","onDetach");

    }
}