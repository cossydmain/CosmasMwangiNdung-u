package com.example.user.mamahelps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    EditText rg_edt,rg_edt2,rg_edt3,rg_edt4;
    TextView rg_txtv;
    String rg1,rg2,rg3,rg4;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        rg_edt = (EditText) findViewById(R.id.rg_edt);
        rg_edt2= (EditText) findViewById(R.id. rg_edt2);
        rg_edt3 = (EditText) findViewById(R.id.rg_edt3);
        rg_edt4 = (EditText) findViewById(R.id.rg_edt4);
        rg_txtv = (TextView) findViewById(R.id.rg_txtv);
        signin=(Button)findViewById(R.id.signin);


        private void signin(){
            Intent mine=new Intent(Registration.this,Welcome.class);
            startActivity(mine);

            signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    rg1 = rg_edt.getText().toString();
                    rg2 = rg_edt2.getText().toString();
                    rg3 = rg_edt3.getText().toString();
                    rg4 = rg_edt4.getText().toString();

                    if ((rg1.equals(rg2)) || (rg3.equals(rg4))){
                        Toast.makeText(Registration.this,"INSERT ALL DETAILS",Toast.LENGTH_LONG).show();
                    }else if ((rg1.equals("a")) && (rg3.equals("b"))){
                        Toast toast= Toast.makeText(Registration.this,"REGISTRATION SUCCESSFULLY",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                    }else{
                        Toast.makeText(Registration.this,"Enter Correct Details...!",Toast.LENGTH_LONG).show();
                    }

                }
            });
        }


    }


}
