package com.hasnain.recylcerviewdifferentarraylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hasnain.recylcerviewdifferentarraylist.Adapters.SecondAdapter;
import com.hasnain.recylcerviewdifferentarraylist.Models.SecondModel;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.modelRecyclerView);



        int food_position = getIntent().getIntExtra("key1",0);
        if (food_position == 0){

            ArrayList<SecondModel> list1 = new ArrayList<>();

            list1.add(new SecondModel(R.drawable.namkeen_goasht,"data1"));
            list1.add(new SecondModel(R.drawable.namkeen_goasht,"data1"));
            list1.add(new SecondModel(R.drawable.namkeen_goasht,"data1"));
            list1.add(new SecondModel(R.drawable.namkeen_goasht,"data1"));

           SecondAdapter adapter1 = new SecondAdapter(list1,this);

            recyclerView.setAdapter(adapter1);

            GridLayoutManager grid = new GridLayoutManager(this,3);
            recyclerView.setLayoutManager(grid);

        }
        else if (food_position == 1){

            ArrayList<SecondModel> list2 = new ArrayList<>();

            list2.add(new SecondModel(R.drawable.chicken_karahi,"data2"));
            list2.add(new SecondModel(R.drawable.chicken_karahi,"data2"));
            list2.add(new SecondModel(R.drawable.chicken_karahi,"data2"));
            list2.add(new SecondModel(R.drawable.chicken_karahi,"data2"));

            SecondAdapter adapter2 = new SecondAdapter(list2,this);

            recyclerView.setAdapter(adapter2);

            GridLayoutManager grid = new GridLayoutManager(this,3);
            recyclerView.setLayoutManager(grid);

        }

    }
}