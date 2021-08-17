package com.hasnain.recylcerviewdifferentarraylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hasnain.recylcerviewdifferentarraylist.Adapters.FirstAdapter;
import com.hasnain.recylcerviewdifferentarraylist.Models.FirstModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.mRecyclerView);


        ArrayList<FirstModel> list = new ArrayList<>();

        list.add(new FirstModel(R.drawable.goasht,"Goasht"));
        list.add(new FirstModel(R.drawable.chabli_kabab,"Chabli Kabab"));
        list.add(new FirstModel(R.drawable.namkeen_goasht,"Namkeen Goasht"));
        list.add(new FirstModel(R.drawable.chicken_karahi,"Chicken Karahi"));


        FirstAdapter adapter = new FirstAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}