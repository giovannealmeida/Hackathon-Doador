package br.com.doadorlegal.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.doadorlegal.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyDonationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyDonationsFragment extends Fragment {

    public MyDonationsFragment() {
        // Required empty public constructor
    }

    public static MyDonationsFragment newInstance() {
        return new MyDonationsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.item_asked_donations, container, false);

        return view;
    }
}
