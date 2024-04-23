package com.example.hw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Game> games;

    StateAdapter(Context context, List<Game> games) {
        this.games = games;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.game_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position) {
        Game game = games.get(position);
        holder.avatarView.setImageResource(game.avatarResource);
        holder.nameView.setText(game.name);
        holder.idView.setText(game.id);
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView avatarView;
        final TextView nameView, idView;
        ViewHolder(View view){
            super(view);
            avatarView = view.findViewById(R.id.avatar);
            nameView = view.findViewById(R.id.name);
            idView = view.findViewById(R.id.id);
        }
    }
}
