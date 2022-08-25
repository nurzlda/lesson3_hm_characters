package com.example.lesson3_month3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharactersAdapter extends RecyclerView.Adapter<CharactersViewHolder> {


    private ArrayList<String> characters;


    public CharactersAdapter(ArrayList<String> characters) {
        this.characters = characters;
    }

    @NonNull
    @Override
    public CharactersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharactersViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_characters, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharactersViewHolder holder, int position) {
        holder.bind(characters.get(position));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
