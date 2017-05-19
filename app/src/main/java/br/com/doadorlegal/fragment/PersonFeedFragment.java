package br.com.doadorlegal.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.doadorlegal.ProfileActivity;
import br.com.doadorlegal.R;
import br.com.doadorlegal.adapter.PersonFeedAdapter;
import br.com.doadorlegal.interfaces.OnItemClickListener;
import br.com.doadorlegal.model.Person;

public class PersonFeedFragment extends Fragment implements OnItemClickListener {

    List<Person> list;

    public PersonFeedFragment() {
    }

    @SuppressWarnings("unused")
    public static PersonFeedFragment newInstance() {
        return new PersonFeedFragment();
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
            recyclerView.setAdapter(new PersonFeedAdapter(getList(), this));
        }
        return view;
    }

    public List<Person> getList() {
        list = new ArrayList<>();
        list.add(new Person("Homerus Lunnon","Problema renal","O-","Hemoacre",R.drawable.pic1));
        list.add(new Person("Charlotte O'Collopy","Acidente","AB","Fhemeron",R.drawable.pic5));
        list.add(new Person("Josey Skea","Problema renal","A+","Hemoba",R.drawable.pic3));
        list.add(new Person("Annis Campion","Acidente","AB-","Fhemeron",R.drawable.pic12));
        list.add(new Person("Monroe Colson","Acidente","AB-","Hemoacre",R.drawable.pic2));
        list.add(new Person("Leilah Grishkov","Tratamento","A-","Hemoba",R.drawable.pic6));
        list.add(new Person("Carlyn Selbie","Problema renal","B+","Hemoba",R.drawable.pic7));
//        list.add(new Person("Neill Monsey","Tratamento","AB+","Hemoce",R.drawable.pic8));
//        list.add(new Person("Isis Leaver","Problema renal","O+","Hemoce",R.drawable.pic9));
//        list.add(new Person("Gates Bernadzki","Tratamento","B-","Hemoba",R.drawable.pic10));
//        list.add(new Person("Samuele Blackstock","Tratamento","AB+","Hemoacre",R.drawable.pic11));
//        list.add(new Person("Kimbra Olley","Tratamento","AB+","Hemoce",R.drawable.pic12));
//        list.add(new Person("Laina Cecil","Problema renal","B+","Hemoba",R.drawable.pic13));
//        list.add(new Person("Welsh Gasnoll","Acidente","B-","Hemoce",R.drawable.pic14));
//        list.add(new Person("Roseann Dowty","Acidente","A+","Hemoacre",R.drawable.pic15));
//        list.add(new Person("Nanice Ritter","Tratamento","AB-","Hemoce",R.drawable.pic16));
//        list.add(new Person("Katy Longrigg","Problema renal","AB","Hemoba",R.drawable.pic1));
//        list.add(new Person("Meredith L'oiseau","Acidente","O-","Hemoce",R.drawable.pic2));
//        list.add(new Person("Brinna Whiting","Tratamento","B+","Hemoce",R.drawable.pic3));
//        list.add(new Person("Maxy Cutten","Tratamento","O+","Hemoba",R.drawable.pic4));
//        list.add(new Person("Francoise Jentzsch","Tratamento","A+","Hemoce",R.drawable.pic5));
//        list.add(new Person("Tiebout Baurerich","Acidente","A+","Fhemeron",R.drawable.pic6));
//        list.add(new Person("Emlyn Flippelli","Acidente","AB-","Fhemeron",R.drawable.pic7));
//        list.add(new Person("Lu Emmens","Tratamento","B-","Hemoba",R.drawable.pic8));
//        list.add(new Person("Gabe Jex","Tratamento","A+","Hemoce",R.drawable.pic9));
//        list.add(new Person("Arnie Abbott","Tratamento","B+","Hemoacre",R.drawable.pic10));
//        list.add(new Person("Deanna Johanning","Problema renal","B+","Hemoce",R.drawable.pic11));
//        list.add(new Person("Fleur Bree","Acidente","AB+","Hemoce",R.drawable.pic12));
//        list.add(new Person("Harris Schwandner","Acidente","AB+","Hemoba",R.drawable.pic13));
//        list.add(new Person("Michele Yakovlev","Tratamento","AB-","Hemoacre",R.drawable.pic14));
//        list.add(new Person("Flo Tomeo","Tratamento","B-","Hemoce",R.drawable.pic15));
//        list.add(new Person("Reggy Crookes","Problema renal","A+","Hemoce",R.drawable.pic16));
//        list.add(new Person("Ber Tedahl","Problema renal","B+","Fhemeron",R.drawable.pic1));
//        list.add(new Person("Codie Lanon","Problema renal","O-","Hemoacre",R.drawable.pic2));
//        list.add(new Person("Allyson Vine","Tratamento","O+","Hemoba",R.drawable.pic3));
//        list.add(new Person("Suzie Domleo","Tratamento","AB+","Hemoce",R.drawable.pic4));
//        list.add(new Person("Priscilla Ruprechter","Tratamento","AB-","Hemoacre",R.drawable.pic5));
//        list.add(new Person("Robbie Wein","Tratamento","A+","Fhemeron",R.drawable.pic6));
//        list.add(new Person("Nata Quirke","Tratamento","B-","Fhemeron",R.drawable.pic7));
//        list.add(new Person("Kriste Dumbrall","Tratamento","B-","Hemoacre",R.drawable.pic8));
        return list;
    }

    @Override
    public void onClick(int position) {
        Person p = list.get(position);
        Intent i = new Intent(getActivity(), ProfileActivity.class);
        i.putExtra("Person",p);
        startActivity(i);
    }

}
