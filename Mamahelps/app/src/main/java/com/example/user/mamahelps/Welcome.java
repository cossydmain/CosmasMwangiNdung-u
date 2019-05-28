package com.example.user.mamahelps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView text,minetxt,text2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        text=(TextView)findViewById(R.id.text);
        minetxt=(TextView)findViewById(R.id.minetxt) ;
        text2=(TextView)findViewById(R.id.text2);
        button=(Button)findViewById(R.id.button);


        minetxt.setText("welcome to mama help appilication which will enable you have well self service and acknowlodgement in any hospipatal around our wide national and privates hospistals and also clincis....    thank you for choosing mamahelp application");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mine=new Intent();

            }
        });

    }
}
