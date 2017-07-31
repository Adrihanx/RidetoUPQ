package com.codesiders.ridetoupq;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Edwing Renteria on 30/07/2017.
 */

public class main_activity extends AppCompatActivity {
     Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        siguiente=(Button)findViewById(R.id.btn1);
        siguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(main_activity.this, clase_bienvenidos.class);
                startActivity(i);
            }
        });

    }
}
