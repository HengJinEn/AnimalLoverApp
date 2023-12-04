package com.example.hanimalloverapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainActivity mainActivity = (MainActivity)getActivity();
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button BtnCat = view.findViewById(R.id.BtnCat);
        View.OnClickListener OCLCat = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.DestCat);
            }
        };
        BtnCat.setOnClickListener(OCLCat);

        Button BtnDog = view.findViewById(R.id.BtnDog);
        View.OnClickListener OCLDog = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.NextToDog);
            }
        };
        BtnDog.setOnClickListener(OCLDog);


        return view;
    }
}