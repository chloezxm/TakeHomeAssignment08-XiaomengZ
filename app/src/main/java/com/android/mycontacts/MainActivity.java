package com.android.mycontacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializePeople();

        RecyclerView recyclerView = findViewById(R.id.people_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PersonAdapter(people, this));
    }

    private void initializePeople() {
        people = new ArrayList<>();
        people.add(new Person(R.drawable.photo1, R.string.person_1_name, R.string.person_1_phone_number));
        people.add(new Person(R.drawable.photo2, R.string.person_2_name, R.string.person_2_phone_number));
        people.add(new Person(R.drawable.photo3, R.string.person_3_name, R.string.person_3_phone_number));
        people.add(new Person(R.drawable.photo4, R.string.person_4_name, R.string.person_4_phone_number));
        people.add(new Person(R.drawable.photo5, R.string.person_5_name, R.string.person_5_phone_number));
        people.add(new Person(R.drawable.photo6, R.string.person_6_name, R.string.person_6_phone_number));
        people.add(new Person(R.drawable.photo7, R.string.person_7_name, R.string.person_7_phone_number));
        people.add(new Person(R.drawable.photo8, R.string.person_8_name, R.string.person_8_phone_number));
        people.add(new Person(R.drawable.photo9, R.string.person_9_name, R.string.person_9_phone_number));
    }
}
