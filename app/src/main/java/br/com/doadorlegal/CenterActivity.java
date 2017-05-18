package br.com.doadorlegal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import br.com.doadorlegal.model.Center;
import br.com.doadorlegal.model.Person;

public class CenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Center c = (Center) getIntent().getSerializableExtra("Center");

        TextView tvName = (TextView) findViewById(R.id.tvName);
        tvName.setText(c.getName());

        TextView tvBloodType = (TextView) findViewById(R.id.tvBloodType);
        tvBloodType.setText(c.getBloodType());

        TextView tvDescription = (TextView) findViewById(R.id.tvDescription);
        tvDescription.setText(c.getDescription());

        TextView tvLocation = (TextView) findViewById(R.id.tvPlace);
        tvLocation.setText(c.getLocation());

        TextView tvTime = (TextView) findViewById(R.id.tvTime);
        tvTime.setText(c.getFuncTime());

        TextView tvDays = (TextView) findViewById(R.id.tvDays);
        tvDays.setText(c.getFuncTime());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return true;
    }
}
