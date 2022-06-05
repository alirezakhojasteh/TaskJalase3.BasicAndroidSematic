package com.test.taskjalase3basicandroidsematic;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("https://hajifirouz12.cdn.asset.aparat.com/aparat-video/94d25d8e8c0620fb34ce4c4a03b3287d45154774-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6ImI0MzgzYTcxNTBiNjI3YTIxYmExMDc2ZDI3Yzk4ZDBmIiwiZXhwIjoxNjU0Mzk1NDQ0LCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.gjDv1N2ftWsuuhRXa3MVnA0HbE_z0lfGK66QH61buFA");
        VideoView video = findViewById(R.id.videoView);
        video.setVideoURI(uri);
        video.start();

        WebView web = findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://g.co/kgs/fbtX1v");


    }
}