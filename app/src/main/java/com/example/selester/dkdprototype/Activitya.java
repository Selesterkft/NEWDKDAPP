package com.example.selester.dkdprototype;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Activitya extends Activity {
    Button b1;
    EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        b1  = findViewById(R.id.loginbutton);
        ed1 = findViewById(R.id.editText1);
        ed2 = findViewById(R.id.editText2);
        final EditText ed3 = findViewById(R.id.editText3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (ed1.getText().toString().equals("admin") &&
                    ed2.getText().toString().equals("admin")) {
                Toast.makeText(getApplicationContext(),
                        "Succsess", Toast.LENGTH_SHORT).show();
                openActivityb();

            }else if (ed3.getText().toString().equals("0000")) {
                openactivityc();
                Toast.makeText(getApplicationContext(),
                        "Inside", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        }
        });
    }
    public void openActivityb () {
        Bundle b = new Bundle();
        b.putString("elso","ez az");
        Intent intent = new Intent(this, Activityb.class);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void openactivityc () {
        Intent intent2 = new Intent(this, Activityc.class);
        startActivity(intent2);
    }

}