package com.au.likedislikecount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button like,dislike,rm_like,rm_dislike;
    int like_count=0,dislike_count=0;
    TextView like_view,dislike_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        like = findViewById(R.id.like);
        dislike = findViewById(R.id.dislike);
        rm_like = findViewById(R.id.rm_like);
        rm_dislike = findViewById(R.id.rm_dislike);
        like_view = findViewById(R.id.like_view);
        dislike_view = findViewById(R.id.dislike_view);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like_count++;
                like_view.setText("Likes "+like_count);
            }
        });

        rm_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(like_count==0)
                {

                }
                else
                {
                    like_count--;
                    like_view.setText("Removed Likes "+like_count);
                }
            }
        });

        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike_count++;
                dislike_view.setText("Dislikes "+dislike_count);
            }
        });

        rm_dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dislike_count==0)
                {

                }
                else
                {
                    dislike_count--;
                    dislike_view.setText("Removed Dislikes "+dislike_count);
                }

            }
        });

    }
}
