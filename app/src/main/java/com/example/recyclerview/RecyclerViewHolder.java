package com.example.recyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewHolder extends RecyclerView.Adapter<RecyclerViewHolder.ViewHolder> {

    private static final String TAG = "RecyclerViewHolder";

    private ArrayList<String> mImageNames = new ArrayList<String>();
    private ArrayList<String> mImages = new ArrayList<String>();
    private Context mcontext;

    public RecyclerViewHolder(Context context, ArrayList<String> mImageNames, ArrayList<String> mNames) {
        this.mImageNames = mImageNames;
        this.mImages = mNames;
        this.mcontext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Log.d(TAG, "onBindViewHolder: called");
        Glide.with(mcontext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(position);
        holder.root_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on " + mImageNames.get(position));
                Toast.makeText(mcontext, mImageNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image;
        TextView imageName;
        RelativeLayout root_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.imageName);
            root_view = itemView.findViewById(R.id.root_view);

        }
    }
}
