package br.com.doadorlegal.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import br.com.doadorlegal.R;
import br.com.doadorlegal.adapter.CenterFeedAdapter;
import br.com.doadorlegal.model.Center;

public class CenterFeedFragment extends Fragment {


    public CenterFeedFragment() {
    }

    @SuppressWarnings("unused")
    public static CenterFeedFragment newInstance() {
        return new CenterFeedFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_feed, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));

            recyclerView.setAdapter(new CenterFeedAdapter(getList(), getActivity()));
        }
        return view;
    }

    private List<Center> getList() {
        List<Center> list = new ArrayList<>();
        list.add(new Center("Hemocentro Universal","Deus seja louvado","A+,AB e O-","Av. Soledade, 1145. Ilha Bela","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Universal","Deus seja louvado","A+,AB e O-","Av. Soledade, 1145. Ilha Bela","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Universal","Deus seja louvado","A+,AB e O-","Av. Soledade, 1145. Ilha Bela","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Universal","Deus seja louvado","A+,AB e O-","Av. Soledade, 1145. Ilha Bela","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Universal","Deus seja louvado","A+,AB e O-","Av. Soledade, 1145. Ilha Bela","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Universal","Deus seja louvado","A+,AB e O-","Av. Soledade, 1145. Ilha Bela","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Universal","Deus seja louvado","A+,AB e O-","Av. Soledade, 1145. Ilha Bela","08:00 - 16:00","Seg. a Sex."));
        return list;
    }
}
