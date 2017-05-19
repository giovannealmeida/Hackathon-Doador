package br.com.doadorlegal.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import br.com.doadorlegal.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChartFragment extends Fragment {

    public ChartFragment() {
        // Required empty public constructor
    }

    public static ChartFragment newInstance() {
        return new ChartFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chart, container, false);
        WebView wvInfos = (WebView) view.findViewById(R.id.wvInfos);

        WebSettings webSettings = wvInfos.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wvInfos.getSettings().setJavaScriptEnabled(true);
        wvInfos.loadUrl("file:///android_asset/cartilha.html");

        return view;
    }
}
