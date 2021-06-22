package edu.gatech.seclass.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name, surname;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.text_name);
        surname = findViewById(R.id.text_surname);
        add = findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                String usersurname = surname.getText().toString();

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("keyname", username);
                intent.putExtra("keysurname", usersurname);
                startActivity(intent);
            }
        });

    }


}