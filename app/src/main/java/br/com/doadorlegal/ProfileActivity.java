package br.com.doadorlegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import br.com.doadorlegal.model.Person;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Paciente");

        final Person p = (Person) getIntent().getSerializableExtra("Person");

        TextView tvName = (TextView) findViewById(R.id.tvName);
        tvName.setText(p.getName());

        TextView tvBloodType = (TextView) findViewById(R.id.tvBloodType);
        tvBloodType.setText(p.getBloodType());

        TextView tvCause = (TextView) findViewById(R.id.tvCause);
        tvCause.setText(p.getCause());

        TextView tvLocation = (TextView) findViewById(R.id.tvPlace);
        tvLocation.setText(p.getLocation());

        AppCompatButton btShare = (AppCompatButton) findViewById(R.id.btShare);
        btShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
                i.putExtra(Intent.EXTRA_TEXT, p.getName()+" precisa de sua ajuda. :) \n\nhttp://doelegal.com");
                startActivity(Intent.createChooser(i, "Compartilhar URL"));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
        }
        return true;
    }
}
