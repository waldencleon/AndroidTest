package edu.gatech.seclass.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    private TextView name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        name = findViewById(R.id.textview1);
        surname = findViewById(R.id.textview2);

        String username = getIntent().getStringExtra("keyname");
        String userSurname = getIntent().getStringExtra("keysurname");

        name.setText(username);
        surname.setText(userSurname);

    }
}