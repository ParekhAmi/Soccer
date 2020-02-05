package com.example.soccer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Recyclerview_League extends Fragment {


   public NavController DashboardNavController;

    private RecyclerView recycle_leaguelist;
    private Context context;
    private ArrayList<Comman_Data_List> comman_data_List;
    private Comman_adapter comman_adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recyclerview_league, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DashboardNavController = Navigation.findNavController(getActivity(),R.id.host_fragment);
        context = getActivity().getApplicationContext();

        /*--------league Adapter Configuration--------*/
        recycle_leaguelist = view.findViewById(R.id.recycle_leaguelist);
        comman_data_List = new ArrayList<Comman_Data_List>();
        comman_adapter = new Comman_adapter(comman_data_List,context);

        recycle_leaguelist.setLayoutManager(new LinearLayoutManager(context));
        recycle_leaguelist.setAdapter(comman_adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        comman_data_List.clear();
        comman_data_List.add(new Comman_Data_List("League 1",R.drawable.user));
        comman_data_List.add(new Comman_Data_List("League 2",R.drawable.user));
        comman_data_List.add(new Comman_Data_List("League 3",R.drawable.user));
        comman_data_List.add(new Comman_Data_List("League 4",R.drawable.user));
        comman_data_List.add(new Comman_Data_List("League 5",R.drawable.user));
        comman_adapter.notifyDataSetChanged();
        comman_adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DashboardNavController.navigate(R.id.League_Functions);
            }
        });

    }

}
