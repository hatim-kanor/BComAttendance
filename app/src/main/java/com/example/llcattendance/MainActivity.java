package com.example.llcattendance;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog.Builder;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLoin;
    EditText et_login;
    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLoin = (Button)findViewById(R.id.button2);
        et_login = (EditText)findViewById(R.id.user);
        disp = (TextView)findViewById(R.id.disp);

        disp.setVisibility(View.GONE);

        disp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isConnectingToInternet(MainActivity.this))
                {
                    disp.setText("Internet is Connected ... ");
                    disp.setVisibility(View.VISIBLE);


                }
                else {
                    disp.setText("No internet connection\nKindly connect to Internet to update attendance");
                    disp.setVisibility(View.VISIBLE);
                }



            }
        });

        if(isConnectingToInternet(MainActivity.this))
        {
            disp.setText("Internet is Connected ... ");
            disp.setVisibility(View.VISIBLE);


        }
        else {
            disp.setText("No internet connection \\n Kindly connect to Internet to update attendance");
        disp.setVisibility(View.VISIBLE);
        }



        btnLoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t_login;
                t_login = et_login.getText().toString().trim().toLowerCase();
                if(t_login.equals("tybcom"))
                {
                    Toast.makeText(getApplicationContext(), "TYBCOM \n Login Successful ", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),tybcom_main.class);
                    startActivity(i);
                    finish();

                }
                else if(t_login.equals("sybcom"))
                {
                    Toast.makeText(getApplicationContext(), "SYBCOM \n Login Successful ", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),bcom_n.class);
                    i.putExtra("year", "sybcom");
                    startActivity(i);
                    finish();


                }
                else if(t_login.equals("fybcom"))
                {
                    Toast.makeText(getApplicationContext(), "FYBCOM \n Login Successful ", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),fybcom.class);
                    i.putExtra("year", "fybcom");
                    startActivity(i);
                    finish();

                }
                else
                {
                    showMessage("Failed","Please Contact HOD for login details");

                }

            }
        });


    }

    public void showMessage(String title,String message){
    Builder builder=new Builder(this);
        builder.setCancelable(true);

        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public static boolean isConnectingToInternet(Context context)
    {
        ConnectivityManager connectivity =
                ( ConnectivityManager ) context.getSystemService(
                        Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
        }
        return false;
    }
}
