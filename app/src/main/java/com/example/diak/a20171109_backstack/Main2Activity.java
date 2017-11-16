package com.example.diak.a20171109_backstack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button bt_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Buttons();
        OnClickListeners();
    }

    public void Buttons(){
        bt_back = (Button) findViewById(R.id.bt_back);
    }

    public void OnClickListeners(){
        this.bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });
    }
}
