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

public class mainActivity extends AppCompatActivity {
    EditText login_Email, login_password, login_confirm;
    Button login;
    TextView text_login;
    String lg1,lg2,lg3="";
    Button signin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_Email = (EditText) findViewById(R.id.login_Email);
        login_password = (EditText) findViewById(R.id.login_password);
        login_confirm = (EditText) findViewById(R.id.login_confirm);
        login = (Button) findViewById(R.id.login_login);
        text_login = (TextView) findViewById(R.id.text_login);
        signin=(Button)findViewById(R.id.signin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lg1 = login_Email.getText().toString();
                lg2 = login_password.getText().toString();
                lg3 = login_confirm.getText().toString();

                if ((lg1.equals(lg2)) || (lg3.equals(lg3))){
                    Toast.makeText(mainActivity.this,"INSERT ALL DETAILS",Toast.LENGTH_LONG).show();
                }else if ((lg1.equals("lg2")) && (lg3.equals("lg3"))){
                    Toast toast= Toast.makeText(mainActivity.this,"LOGIN SUCCESSFULLY",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }else{
                    Toast.makeText(mainActivity.this,"Enter Correct Details....,!",Toast.LENGTH_LONG).show();
                }
            }
            private void login() {
                Intent mike=new Intent(mainActivity.this,Registration.class);
                startActivity(mike);

                String le = login_Email.getText().toString().trim();
                String lp = login_password.getText().toString().trim();
                String lc = login_confirm.getText().toString().trim();
                String tl = text_login.getText().toString().trim();
            }


        });


    }
}

