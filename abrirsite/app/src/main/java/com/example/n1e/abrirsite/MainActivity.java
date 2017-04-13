package com.example.n1e.abrirsite;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.xwalk.core.XWalkView;


public class MainActivity extends ActionBarActivity {
    private XWalkView xWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xWalkWebView=(XWalkView)findViewById(R.id.xwalkWebView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (xWalkWebView != null) {
            xWalkWebView.resumeTimers();
            xWalkWebView.onShow();
        }
        xWalkWebView.load("https://www.facebook.com/kelli.cesar",null);
    }


}