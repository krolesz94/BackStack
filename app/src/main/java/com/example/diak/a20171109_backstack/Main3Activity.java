package com.example.diak.a20171109_backstack;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

public class Main3Activity extends AppCompatActivity {

    private Button bt_save2;
    private EditText edit_adat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Datas();
        OnClickListeners();
    }

    public void Datas(){
        bt_save2 = (Button) findViewById(R.id.bt_save2);
        edit_adat = (EditText) findViewById(R.id.Edit_txt);
    }

    public void OnClickListeners(){
        this.bt_save2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences SP = getSharedPreferences("MyDate", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = SP.edit();
                editor.putString("name", edit_adat.getText().toString());
                editor.commit();

                Intent back = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(back);
                Toast.makeText(Main3Activity.this, "Adat mentve", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
