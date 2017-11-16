package com.example.diak.a20171109_backstack;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt_next, bt_save, bt_info, bt_exit;

    @Nullable
    @Override
    public ActionBar getActionBar() {
        return super.getActionBar();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttons();
        OnClickListener();
        //getActionBar().hide();
    }

    public void Buttons(){
        bt_next = (Button) findViewById(R.id.bt_next);
        bt_save = (Button) findViewById(R.id.bt_save);
        bt_info = (Button) findViewById(R.id.bt_info);
        bt_exit = (Button) findViewById(R.id.bt_exit);
    }

    public void Alert(){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("Ki fogsz lépni!!");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Tőlem",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                    }
                });
        alertDialog.show();
    }

    public void OnClickListener(){
        this.bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(next);
                finish();
            }
        });


        this.bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(next);
                finish();
            }
        });

        this.bt_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences SP = getSharedPreferences("MyDate", Context.MODE_PRIVATE);
                String information = SP.getString("name","");
                Toast.makeText(MainActivity.this, "SharedPreference adat: " + information, Toast.LENGTH_SHORT).show();
            }
        });

        this.bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alert();

            }
        });




    }


}
