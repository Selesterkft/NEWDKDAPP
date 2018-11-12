package com.example.selester.dkdprototype;
import android.content.Intent;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activitya extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        button=(Button) findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityb();
            }
        });
    }
    public void openActivityb(){
        Intent intent = new Intent(this,Activityb.class);
        startActivity(intent);
    }
}
