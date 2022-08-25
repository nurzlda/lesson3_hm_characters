package com.example.lesson3_month3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharactersViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCharacters;

    public CharactersViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCharacters= itemView.findViewById(R.id.tv_characters);
    }

    public void bind(String characters){
        tvCharacters.setText(characters);
    }
}
