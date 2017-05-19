
package br.com.doadorlegal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.doadorlegal.model.Person;

public class ProfileActivity extends AppCompatActivity {

    private AppCompatButton btSolicitate;

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

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(p.getPic());

        final AppCompatButton btShare = (AppCompatButton) findViewById(R.id.btShare);
        btShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Sharing URL");
                i.putExtra(Intent.EXTRA_TEXT, p.getName()+" precisa de sua ajuda. :) \n\nhttp://doe.me/8G32DS9GH");
                startActivity(Intent.createChooser(i, "Compartilhar URL"));
            }
        });

        btSolicitate = (AppCompatButton) findViewById(R.id.btSolicitate);
        btSolicitate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(ProfileActivity.this);
                dialogBuilder.setPositiveButton("Agendar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btSolicitate.setText("Doação agendada :)");
                        btSolicitate.setSupportBackgroundTintList(ContextCompat.getColorStateList(ProfileActivity.this, R.color.colorPrimary));
                    }
                });
// ...Irrelevant code for customizing the buttons and title
                LayoutInflater inflater = ProfileActivity.this.getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.dialog_default, null);
                dialogBuilder.setView(dialogView);
//
//                EditText editText = (EditText) dialogView.findViewById();
//                editText.setText("test label");
                AlertDialog alertDialog = dialogBuilder.create();
                alertDialog.setTitle("Escolha uma data");
                alertDialog.show();
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