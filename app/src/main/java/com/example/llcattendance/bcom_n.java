package com.example.llcattendance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class bcom_n extends AppCompatActivity {
    Button a, b, c,d;
    LinearLayout ll_1,ll_2;
    Button AB1,AB2,AB3,AB4,AB5,AB6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bcom_n);


        a = ( Button ) findViewById(R.id.div_A);
        b = ( Button ) findViewById(R.id.div_B);
        c = ( Button ) findViewById(R.id.div_C);
        d = (Button)findViewById(R.id.div_D);
        ll_1 = (LinearLayout)findViewById(R.id.ll1);
        ll_2 = (LinearLayout)findViewById(R.id.ll2);
        AB1 = (Button)findViewById(R.id.AB1);
        AB2 = (Button)findViewById(R.id.AB2);
        AB3 = (Button)findViewById(R.id.AB3);
        AB4 = (Button)findViewById(R.id.AB4);
        AB5 = (Button)findViewById(R.id.AB5);
        //AB6 = (Button)findViewById(R.id.AB6);
        ll_1.setVisibility(View.GONE);
        ll_2.setVisibility(View.GONE);
        a.setText("A");
        b.setText("B");
        c.setText("C");
        d.setText("D");

            a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ll_1.setVisibility(View.GONE);
                    ll_2.setVisibility(View.GONE);
                    Intent i = new Intent(getApplicationContext(), sybcom_v.class);
                    i.putExtra("div", "sybcom_A");
                    startActivity(i);
                    finish();
                }
            });

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ll_1.setVisibility(View.GONE);
                    ll_2.setVisibility(View.GONE);
                    Intent i = new Intent(getApplicationContext(), sybcom_v.class);
                    i.putExtra("div", "sybcom_B");
                    startActivity(i);
                    finish();

                }
            });

            c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent i = new Intent(getApplicationContext(), sybcom_v.class);
//                    i.putExtra("div", "sybcom_C");
//                    startActivity(i);
//                    finish();


                    final AlertDialog dialog = new AlertDialog.Builder(bcom_n.this)
                            .setTitle("Please Select Type")
                            .setIcon(R.drawable.info)
                            .setMessage("Attendance Type for Division 'C'")
                            .setPositiveButton("Practicals",null)
                            .setNegativeButton("Lecture",null)
                            .show();

                    Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                    positiveButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                            c.setText("'C' Div Computer");
                            ll_1.setVisibility(View.VISIBLE);
                            ll_2.setVisibility(View.VISIBLE);
                        }
                    });

                    Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                    negativeButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                            Intent intent11 = new Intent(bcom_n.this,sybcom_v.class);
                            intent11.putExtra("div", "sybcom_C");
                            startActivity(intent11);
                            finish();
                        }
                    });
                }
            });
            d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ll_1.setVisibility(View.GONE);
                    ll_2.setVisibility(View.GONE);
                    Intent i = new Intent(getApplicationContext(), sybcom_v.class);
                    i.putExtra("div", "sybcom_D");
                    startActivity(i);
                    finish();
                }
            });

            AB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(getApplicationContext(), Sybcom_Computer.class);
                    i1.putExtra("div", "sybcom_C");
                    i1.putExtra("tp", "computer_B1");
                    startActivity(i1);
                    finish();

                }
            });
            AB2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(getApplicationContext(), Sybcom_Computer.class);
                    i1.putExtra("div", "sybcom_C");
                    i1.putExtra("tp", "computer_B2");
                    startActivity(i1);
                    finish();

                }
            });
            AB3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(getApplicationContext(), Sybcom_Computer.class);
                    i1.putExtra("div", "sybcom_C");
                    i1.putExtra("tp", "computer_B3");
                    startActivity(i1);
                    finish();

                }
            });
            AB4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(getApplicationContext(), Sybcom_Computer.class);
                    i1.putExtra("div", "sybcom_C");
                    i1.putExtra("tp", "computer_B4");
                    startActivity(i1);
                    finish();

                }
            });
            AB5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(getApplicationContext(), Sybcom_Computer.class);
                    i1.putExtra("div", "sybcom_C");
                    i1.putExtra("tp", "computer_B5");
                    startActivity(i1);
                    finish();

                }
            });
//            AB6.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent i1 = new Intent(getApplicationContext(), Sybcom_Computer.class);
//                    i1.putExtra("div", "sybcom_C");
//                    i1.putExtra("tp", "computer_B6");
//                    startActivity(i1);
//                    finish();
//
//                }
//            });


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back button clicked ... \n Click on Home button to go back", Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.logout)
        {
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();


        }


        return super.onOptionsItemSelected(item);
    }


}
