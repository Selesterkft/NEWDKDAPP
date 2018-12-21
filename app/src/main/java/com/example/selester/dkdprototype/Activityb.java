package com.example.selester.dkdprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activityb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityb);
        Log.i("TAG",getIntent().getExtras().getString("elso"));

        Button button = findViewById(R.id.backgroundbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityc();
            }
        });
    }
    public void openActivityc(){
        Intent intent = new Intent(this,Activityc.class);
        startActivity(intent);
    }
}
