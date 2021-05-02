package com.widiatmoko.WidiApp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Fragmentweb extends Fragment {
    private WebView webviewku;
    private WebSettings websettingku;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmentweb, container, false);
        webviewku = view.findViewById(R.id.webview);
        websettingku = webviewku.getSettings();

        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://jalantikus.com");

        return view;
    }
}