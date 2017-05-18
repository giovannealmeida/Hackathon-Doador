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
        list.add(new Person("Homerus Lunnon","Problema renal","O-","Hemoacre"));
        list.add(new Person("Charlotte O'Collopy","Acidente","AB","Fhemeron"));
        list.add(new Person("Josey Skea","Problema renal","A+","Hemoba"));
        list.add(new Person("Annis Campion","Acidente","AB-","Fhemeron"));
        list.add(new Person("Monroe Colson","Acidente","AB-","Hemoacre"));
        list.add(new Person("Leilah Grishkov","Tratamento","A-","Hemoba"));
        list.add(new Person("Carlyn Selbie","Problema renal","B+","Hemoba"));
        list.add(new Person("Neill Monsey","Tratamento","AB+","Hemoce"));
        list.add(new Person("Isis Leaver","Problema renal","O+","Hemoce"));
        list.add(new Person("Gates Bernadzki","Tratamento","B-","Hemoba"));
        list.add(new Person("Samuele Blackstock","Tratamento","AB+","Hemoacre"));
        list.add(new Person("Kimbra Olley","Tratamento","AB+","Hemoce"));
        list.add(new Person("Laina Cecil","Problema renal","B+","Hemoba"));
        list.add(new Person("Welsh Gasnoll","Acidente","B-","Hemoce"));
        list.add(new Person("Roseann Dowty","Acidente","A+","Hemoacre"));
        list.add(new Person("Nanice Ritter","Tratamento","AB-","Hemoce"));
        list.add(new Person("Katy Longrigg","Problema renal","AB","Hemoba"));
        list.add(new Person("Meredith L'oiseau","Acidente","O-","Hemoce"));
        list.add(new Person("Brinna Whiting","Tratamento","B+","Hemoce"));
        list.add(new Person("Maxy Cutten","Tratamento","O+","Hemoba"));
        list.add(new Person("Francoise Jentzsch","Tratamento","A+","Hemoce"));
        list.add(new Person("Tiebout Baurerich","Acidente","A+","Fhemeron"));
        list.add(new Person("Emlyn Flippelli","Acidente","AB-","Fhemeron"));
        list.add(new Person("Lu Emmens","Tratamento","B-","Hemoba"));
        list.add(new Person("Gabe Jex","Tratamento","A+","Hemoce"));
        list.add(new Person("Arnie Abbott","Tratamento","B+","Hemoacre"));
        list.add(new Person("Deanna Johanning","Problema renal","B+","Hemoce"));
        list.add(new Person("Fleur Bree","Acidente","AB+","Hemoce"));
        list.add(new Person("Harris Schwandner","Acidente","AB+","Hemoba"));
        list.add(new Person("Michele Yakovlev","Tratamento","AB-","Hemoacre"));
        list.add(new Person("Flo Tomeo","Tratamento","B-","Hemoce"));
        list.add(new Person("Reggy Crookes","Problema renal","A+","Hemoce"));
        list.add(new Person("Ber Tedahl","Problema renal","B+","Fhemeron"));
        list.add(new Person("Codie Lanon","Problema renal","O-","Hemoacre"));
        list.add(new Person("Allyson Vine","Tratamento","O+","Hemoba"));
        list.add(new Person("Suzie Domleo","Tratamento","AB+","Hemoce"));
        list.add(new Person("Priscilla Ruprechter","Tratamento","AB-","Hemoacre"));
        list.add(new Person("Robbie Wein","Tratamento","A+","Fhemeron"));
        list.add(new Person("Nata Quirke","Tratamento","B-","Fhemeron"));
        list.add(new Person("Kriste Dumbrall","Tratamento","B-","Hemoacre"));
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
