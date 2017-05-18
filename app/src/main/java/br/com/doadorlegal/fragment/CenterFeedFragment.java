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
        list.add(new Center("Hemoacre","Deus seja louvado","A+,AB e O-","Av. Getúlio Vargas, 2787 - Vila Ivonete - Rio Branco, Acre - Cep:69914-500","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemoap","Deus seja louvado","AB e O-","Av Fab, 0 - Central - Macapa, Amapá - Cep:68900-073","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Fhemoam","Deus seja louvado","A+,AB e O-","Av Constantino Nery, 4397 - Chapada - Manaus, Amazonas - Cep:69050-000","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Fundação Hemopa","Deus seja louvado","A+,AB e O-","Travessa Padre Eutiquio, 2109 - Batista Campos - Belem, Pará - Cep:66033-000","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Fhemeron","Deus seja louvado","A+,AB e O-","R Benedito De S Brito, 0 Fhemeron - Industrial - Porto Velho, Rondônia - Cep:76821-080","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Uct De Ji Paraná","Deus seja louvado","A+,AB e O-","R Vilagran Cabrita, 1440 - Centro - Ji-parana, Rondônia - Cep:76900-044","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro De Roraima","Deus seja louvado","A+,AB e O-","Av Brg Eduardo Gomes, 3418 - Aeroporto - Boa Vista, Roraima - Cep:69304-015","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Unidade De Coleta De Transfusão Augustinópolis","Deus seja louvado","A+,AB e O-","Rua Amicuns, 200 - Setor Central - Augustinopolis, Tocantins - Cep:77960-000","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Coordenador De Palmas","Deus seja louvado","A+,AB e O-","301 Norte, Av. Ns 01, Conj. 02 Lote 01, 0 - Plano Diretor Norte - Palmas, Tocantins - Cep:77015-200","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro Regional De Araguaína","Deus seja louvado","A+,AB e O-","R Treze De Maio, 1336 - Setor Central - Araguaina, Tocantins - Cep:77803-130","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Núcleo De Hemoterapia De Gurupi","Deus seja louvado","A+,AB e O-","R Quatorze De Novembro, 0 Qd: 117 Lote:18 - Setor Central - Gurupi, Tocantins - Cep:77405-070","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemocentro De Alagoas – Hemoal","Deus seja louvado","A+,AB e O-","Av. Jorge De Lima, 58 - Trapiche - Maceio, Alagoas - Cep:57010-300","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemoba","Deus seja louvado","A+,AB e O-","Ld Do Hospital Geral, 0 2º Andar - Brotas - Salvador, Bahia - Cep:40286-240","08:00 - 16:00","Seg. a Sex."));
        list.add(new Center("Hemoce","Deus seja louvado","A+,AB e O-","R Raimundo Facanha, 3390 - Rodolfo Teofilo - Fortaleza, Ceará - Cep:60431-000","08:00 - 16:00","Seg. a Sex."));
        return list;
    }
}
