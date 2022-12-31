package com.example.e_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class Ajouter extends AppCompatActivity {
    EditText edit;
    Button bnt;
    ArrayList<String> p;
    ArrayAdapter<String> s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter);
        edit =findViewById(R.id.edit);
        bnt=findViewById(R.id.bnt);

        Intent l=getIntent();



                bnt.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        String ed = edit.getText().toString();
                        p = new ArrayList<String>();
                        s = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, p);

                        p.add(ed);


                        Intent c = new Intent(Ajouter.this, PCActivity.class);
                        c.putExtra(Intent.EXTRA_CHANGED_COMPONENT_NAME_LIST,new String[]{ed});
                        startActivity(c);
                    }


                });


            }

    }