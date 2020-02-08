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
import android.widget.TextView;


public class League_Details extends Fragment {

    public NavController navController;
    private Context context;

    TextView League_Functions;

    Button add_team_btn,remove_team_btn,team_list_btn,upcoming_matches_btn,schedule_match_btn,played_match_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_league__details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(getActivity(),R.id.host_fragment);
        context = getActivity().getApplicationContext();
        add_team_btn = view.findViewById(R.id.add_team_btn);
        remove_team_btn = view.findViewById(R.id.remove_team_btn);
        team_list_btn = view.findViewById(R.id.team_list_btn);
        upcoming_matches_btn = view.findViewById(R.id.upcoming_matches_btn);
        schedule_match_btn = view.findViewById(R.id.schedule_match_btn);
        played_match_btn = view.findViewById(R.id.played_match_btn);
        /*add_team_btn.setOnClickListener(this);
        remove_team_btn.setOnClickListener(this);
        team_list_btn.setOnClickListener(this);
        upcoming_matches_btn.setOnClickListener(this);
        schedule_match_btn.setOnClickListener(this);
        played_match_btn.setOnClickListener(this);*/

    }

    /*@Override
    public void onClick(View view) {
        if(view==add_team_btn){
            navController.navigate(R.id.signUp2_Fragment);
        }
        else if(view==remove_team_btn){
            navController.navigate(R.id.signUp2_Fragment);
        }
        else if(view==team_list_btn){
            navController.navigate(R.id.signUp2_Fragment);
        }
        else if(view==upcoming_matches_btn){
            navController.navigate(R.id.signUp2_Fragment);
        }
        else if(view==schedule_match_btn){
            navController.navigate(R.id.signUp2_Fragment);
        }
        else if(view==played_match_btn){
            navController.navigate(R.id.signUp2_Fragment);
        }

    }*/

}
