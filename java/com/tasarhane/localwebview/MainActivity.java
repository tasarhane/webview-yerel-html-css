package com.tasarhane.localwebview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends Activity {

    WebView WebGorunum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebGorunum = (WebView)findViewById(R.id.webView);

        WebGorunum.loadUrl("file:///android_asset/index.html");
    }


    @Override
    public void onBackPressed() {
        if (WebGorunum.canGoBack()) {
            WebGorunum.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
