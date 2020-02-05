package com.example.soccer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Create_League extends Fragment implements View.OnClickListener{

    public NavController navController;
    private Context context;

    Button create_new_league_btn,cancel_btn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create__league, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(getActivity(),R.id.host_fragment);
        context = getActivity().getApplicationContext();
        create_new_league_btn = view.findViewById(R.id.create_new_league_btn);
        cancel_btn = view.findViewById(R.id.cancel_btn);

        create_new_league_btn.setOnClickListener(this);
        cancel_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view==create_new_league_btn){
            navController.navigate(R.id.recycle_leaguelist);
        }
    }
}
