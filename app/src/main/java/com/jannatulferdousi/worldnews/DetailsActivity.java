package com.jannatulferdousi.worldnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.jannatulferdousi.worldnews.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadlines headlines;
    TextView txt_title,txt_author,txt_time,txt_detail,txt_content;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt_title = findViewById(R.id.txt_details_title);
        txt_author = findViewById(R.id.txt_details_author);
        txt_time = findViewById(R.id.txt_details_time);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_content = findViewById(R.id.text_detail_contnt);
        img_news = findViewById(R.id.img_details_news);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        txt_title.setText(headlines.getTitle());
        txt_author.setText(headlines.getAuthor());
        txt_time.setText(headlines.getPublishedAt());
        txt_detail.setText(headlines.getDescription());
        txt_content.setText(headlines.getContent());

        Picasso.get().load(headlines.getUrlToImage()).into(img_news);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



    }
}