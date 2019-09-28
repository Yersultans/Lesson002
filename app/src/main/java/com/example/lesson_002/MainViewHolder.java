package com.example.lesson_002;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MainViewHolder extends RecyclerView.ViewHolder {

    private TextView tvElementName;

    MainViewHolder(@NonNull View itemView) {
        super(itemView);
        tvElementName = itemView.findViewById(R.id.tvElementName);
    }

    void onBind(final Element element, final MainClickListener listener) {
        tvElementName.setText(element.getName());
        tvElementName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(element);
            }
        });
    }
}
