package com.example.tripit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Dialog d;
    EditText username, passsword;
    Button bt1, bt2, leave, bt3;
    ProgressDialog pd;
    String[] user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.signin);
        bt3 = findViewById(R.id.login);
        bt3.setOnClickListener(this);
        bt1.setOnClickListener(this);
        user = new String[100];


    }

    public void creatLoginDialog() {
        d = new Dialog(this);
        d.setContentView(R.layout.signin);
        d.setTitle("login");
        username = d.findViewById(R.id.username);
        passsword = d.findViewById(R.id.passsword);
        leave = d.findViewById(R.id.leave);
        bt2 = d.findViewById(R.id.btlogin2);


        bt2.setOnClickListener(this);
        leave.setOnClickListener(this);
        d.setCancelable(true);
        d.show();


    }

    @Override
    public void onClick(View v) {
        if (v == leave) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("סגירת לשונית זו תמחק את השם משתמש והסיסמא שהקלדת");

            builder.setCancelable(true);
            builder.setPositiveButton("אני יודע", new ad());
            builder.setNegativeButton("אל תסגור ", new ad());
            AlertDialog dialog = builder.create();
            dialog.show();

        } else if (v == bt1) {
            creatLoginDialog();
        } else if (v == bt2) {
            if (username.getText().toString().length() > 0 && passsword.getText().toString().length() > 0) {

                Toast.makeText(this, "username and password saved", Toast.LENGTH_LONG).show();
                // d.dismiss();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra("user", username.getText().toString());
                startActivity(intent);
                for (int i = 0; i < user.length; i++) {
                    if (user[i] == null) {
                        user[i] = username.getText().toString() + "." + passsword.getText().toString();
                    }
                }
            } else Toast.makeText(this, "תמלא סיסמא ושם משתמש", Toast.LENGTH_LONG).show();

        }
        else if (v == bt3)
        {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        }

        //   pd=ProgressDialog.show(this, "", "loading, please wait...", true);
        // pd.setCancelable(true);
        //pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        // pd.setMessage("Loading");
        // pd.show();



    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    public class ad implements DialogInterface.OnClickListener
    {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            if(which==-1) d.dismiss();
        }
    }
}