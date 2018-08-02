package com.mohan.recyclejson;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.mohan.recyclejson.MainActivity.EXTRA_AUTHOR;
import static com.mohan.recyclejson.MainActivity.EXTRA_LIKES;
import static com.mohan.recyclejson.MainActivity.EXTRA_URL;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String  authorName = intent.getStringExtra(EXTRA_AUTHOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);

        ImageView imageViewDetail = findViewById(R.id.image_view_detail);
        TextView textViewAuthor = findViewById(R.id.author_view_detail);
        TextView textViewLikes = findViewById(R.id.likes_view_detail);

        Picasso.get().load(imageUrl).fit().centerCrop().into(imageViewDetail);
        textViewAuthor.setText(authorName);
        textViewLikes.setText("Likes: "+ likeCount);
    }
}
