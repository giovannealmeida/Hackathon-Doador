
package br.com.doadorlegal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import br.com.doadorlegal.model.Person;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Paciente");

        Person p = (Person) getIntent().getSerializableExtra("Person");

        TextView tvName = (TextView) findViewById(R.id.tvName);
        tvName.setText(p.getName());

        TextView tvBloodType = (TextView) findViewById(R.id.tvBloodType);
        tvBloodType.setText(p.getBloodType());

        TextView tvCause = (TextView) findViewById(R.id.tvCause);
        tvCause.setText(p.getCause());

        TextView tvLocation = (TextView) findViewById(R.id.tvPlace);
        tvLocation.setText(p.getLocation());
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