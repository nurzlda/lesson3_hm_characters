package com.example.lesson3_month3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> characters = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerview);

        characters.add("Чуловек Паук");
        characters.add("Тор");
        characters.add("Росомаха");
        characters.add("Железный Человек");
        characters.add("Капитан Америка");
        characters.add("Доктор Стрэндж");
        characters.add("Халк");
        characters.add("Капитан Марвел");
        characters.add("Джин Грей");
        characters.add("Флэш");
        characters.add("Звездный Лорд");
        characters.add("Соколиный Глаз");
        characters.add("Стервятник");
        characters.add("Черная Пантера");
       

        CharactersAdapter adapter = new CharactersAdapter(characters);
        recyclerView.setAdapter(adapter);
    }
}