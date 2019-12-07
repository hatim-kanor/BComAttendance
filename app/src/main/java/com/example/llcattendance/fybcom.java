package com.example.llcattendance;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class fybcom extends AppCompatActivity {
    Button a,b,c,d;
    LinearLayout ll_A,ll_B,ll_C,ll_D;
    Button AB1,AB2,AB3,AB4;
    Button BB1,BB2,BB3,BB4;
    Button CB1,CB2,CB3,CB4;
    Button DB1,DB2,DB3,DB4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fybcom);



        a = ( Button ) findViewById(R.id.div_A);
        b = ( Button ) findViewById(R.id.div_B);
        c = ( Button ) findViewById(R.id.div_C);
        d = (Button)findViewById(R.id.div_D);
        ll_A = (LinearLayout)findViewById(R.id.ll1);
        ll_B = (LinearLayout)findViewById(R.id.ll2);
        ll_C = (LinearLayout)findViewById(R.id.ll3);
        ll_D = (LinearLayout)findViewById(R.id.ll4);
        AB1 = (Button)findViewById(R.id.AB1);
        AB2 = (Button)findViewById(R.id.AB2);
        AB3 = (Button)findViewById(R.id.AB3);
        AB4 = (Button)findViewById(R.id.AB4);
        BB1 = (Button)findViewById(R.id.BB1);
        BB2 = (Button)findViewById(R.id.BB2);
        BB3 = (Button)findViewById(R.id.BB3);
        BB4 = (Button)findViewById(R.id.BB4);
        CB1 = (Button)findViewById(R.id.CB1);
        CB2 = (Button)findViewById(R.id.CB2);
        CB3 = (Button)findViewById(R.id.CB3);
        CB4 = (Button)findViewById(R.id.CB4);
        DB1 = (Button)findViewById(R.id.DB1);
        DB2 = (Button)findViewById(R.id.DB2);
        DB3 = (Button)findViewById(R.id.DB3);
        DB4 = (Button)findViewById(R.id.DB4);

        ll_A.setVisibility(View.GONE);
        ll_B.setVisibility(View.GONE);
        ll_C.setVisibility(View.GONE);
        ll_D.setVisibility(View.GONE);

        a.setText("A");
        b.setText("B");
        c.setText("C");
        d.setText("D");

        if(isConnectingToInternet(fybcom.this)) {
            AB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i1.putExtra("div", "fybcom_A");
                    i1.putExtra("tp", "tutorial_AB1");
                    startActivity(i1);
                    finish();
                }
            });
            AB2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i2 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i2.putExtra("div", "fybcom_A");
                    i2.putExtra("tp", "tutorial_AB2");
                    startActivity(i2);
                    finish();
                }
            });
            AB3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i3 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i3.putExtra("div", "fybcom_A");
                    i3.putExtra("tp", "tutorial_AB3");
                    startActivity(i3);
                    finish();
                }
            });
            AB4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i4 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i4.putExtra("div", "fybcom_A");
                    i4.putExtra("tp", "tutorial_AB4");
                    startActivity(i4);
                    finish();
                }
            });
            BB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i5 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i5.putExtra("div", "fybcom_B");
                    i5.putExtra("tp", "tutorial_BB1");
                    startActivity(i5);
                    finish();
                }
            });
            BB2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i6 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i6.putExtra("div", "fybcom_B");
                    i6.putExtra("tp", "tutorial_BB2");
                    startActivity(i6);
                    finish();
                }
            });
            BB3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i7 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i7.putExtra("div", "fybcom_B");
                    i7.putExtra("tp", "tutorial_BB3");
                    startActivity(i7);
                    finish();
                }
            });
            BB4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i8 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i8.putExtra("div", "fybcom_B");
                    i8.putExtra("tp", "tutorial_BB4");
                    startActivity(i8);
                    finish();
                }
            });
            CB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i9 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i9.putExtra("div", "fybcom_C");
                    i9.putExtra("tp", "tutorial_CB1");
                    startActivity(i9);
                    finish();
                }
            });
            CB2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i10 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i10.putExtra("div", "fybcom_C");
                    i10.putExtra("tp", "tutorial_CB2");
                    startActivity(i10);
                    finish();
                }
            });
            CB3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i11 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i11.putExtra("div", "fybcom_C");
                    i11.putExtra("tp", "tutorial_CB3");
                    startActivity(i11);
                    finish();
                }
            });
            CB4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i12 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i12.putExtra("div", "fybcom_C");
                    i12.putExtra("tp", "tutorial_CB4");
                    startActivity(i12);
                    finish();
                }
            });
            DB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i13 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i13.putExtra("div", "fybcom_D");
                    i13.putExtra("tp", "tutorial_DB1");
                    startActivity(i13);
                    finish();
                }
            });
            DB2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i14 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i14.putExtra("div", "fybcom_D");
                    i14.putExtra("tp", "tutorial_DB2");
                    startActivity(i14);
                    finish();
                }
            });
            DB3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i15 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i15.putExtra("div", "fybcom_D");
                    i15.putExtra("tp", "tutorial_DB3");
                    startActivity(i15);
                    finish();
                }
            });
            DB4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i16 = new Intent(getApplicationContext(), Fybcom_Tutorial.class);
                    i16.putExtra("div", "fybcom_D");
                    i16.putExtra("tp", "tutorial_DB4");
                    startActivity(i16);
                    finish();
                }
            });
            a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent i = new Intent(getApplicationContext(), fybcom_v.class);
//                    i.putExtra("div", "fybcom_A");
//                    startActivity(i);
//                    finish();
                    if (isConnectingToInternet(fybcom.this)) {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("Please Select Type")
                                .setIcon(R.drawable.info)
                                .setMessage("Attendance Type for Division 'A'")
                                .setPositiveButton("Tutorial", null)
                                .setNegativeButton("Lecture", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                a.setText("'A' Div Tutorials ");
                                b.setText("B");
                                c.setText("C");
                                d.setText("D");
                                ll_A.setVisibility(View.VISIBLE);
                                ll_B.setVisibility(View.GONE);
                                ll_C.setVisibility(View.GONE);
                                ll_D.setVisibility(View.GONE);
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, fybcom_v.class);
                                intent11.putExtra("div", "fybcom_A");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                    else
                    {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("No Internet Connection")
                                .setIcon(R.drawable.signal)
                                .setMessage("Please Switch on your Internet Connection")
                                .setPositiveButton("Settings", null)
                                .setNegativeButton("Cancel", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, MainActivity.class);
                                intent11.putExtra("div", "fybcom_A");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                }
            });

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent i = new Intent(getApplicationContext(), fybcom_v.class);
//                    i.putExtra("div", "fybcom_B");
//                    startActivity(i);
//                    finish();
                    if (isConnectingToInternet(fybcom.this)) {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("Please Select Type")
                                .setIcon(R.drawable.info)
                                .setMessage("Attendance Type for Division 'B'")
                                .setPositiveButton("Tutorial", null)
                                .setNegativeButton("Lecture", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                a.setText("A");
                                b.setText("'B' Div Tutorials");
                                c.setText("C");
                                d.setText("D");
                                ll_A.setVisibility(View.GONE);
                                ll_B.setVisibility(View.VISIBLE);
                                ll_C.setVisibility(View.GONE);
                                ll_D.setVisibility(View.GONE);
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, fybcom_v.class);
                                intent11.putExtra("div", "fybcom_B");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                    else
                    {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("No Internet Connection")
                                .setIcon(R.drawable.signal)
                                .setMessage("Please Switch on your Internet Connection")
                                .setPositiveButton("Settings", null)
                                .setNegativeButton("Cancel", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, MainActivity.class);
                                intent11.putExtra("div", "fybcom_B");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                }
            });

            c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent i = new Intent(getApplicationContext(), fybcom_v.class);
//                    i.putExtra("div", "fybcom_C");
//                    startActivity(i);
//                    finish();
                    if (isConnectingToInternet(fybcom.this)) {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("Please Select Type")
                                .setIcon(R.drawable.info)
                                .setMessage("Attendance Type for Division 'C'")
                                .setPositiveButton("Tutorial", null)
                                .setNegativeButton("Lecture", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                a.setText("A");
                                b.setText("B");
                                c.setText("'C' Div Tutorials");
                                d.setText("D");
                                ll_A.setVisibility(View.GONE);
                                ll_B.setVisibility(View.GONE);
                                ll_C.setVisibility(View.VISIBLE);
                                ll_D.setVisibility(View.GONE);
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, fybcom_v.class);
                                intent11.putExtra("div", "fybcom_C");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                    else
                    {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("No Internet Connection")
                                .setIcon(R.drawable.signal)
                                .setMessage("Please Switch on your Internet Connection")
                                .setPositiveButton("Settings", null)
                                .setNegativeButton("Cancel", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, MainActivity.class);
                                intent11.putExtra("div", "fybcom_C");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                }
            });
            d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent i = new Intent(getApplicationContext(), fybcom_v.class);
//                    i.putExtra("div", "fybcom_D");
//                    startActivity(i);
//                    finish();
                    if (isConnectingToInternet(fybcom.this)) {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("Please Select Type")
                                .setIcon(R.drawable.info)
                                .setMessage("Attendance Type for Division 'D'")
                                .setPositiveButton("Tutorial", null)
                                .setNegativeButton("Lecture", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                a.setText("A");
                                b.setText("B");
                                c.setText("C");
                                d.setText("'D' Div Tutorials");
                                dialog.dismiss();
                                ll_A.setVisibility(View.GONE);
                                ll_B.setVisibility(View.GONE);
                                ll_C.setVisibility(View.GONE);
                                ll_D.setVisibility(View.VISIBLE);
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, fybcom_v.class);
                                intent11.putExtra("div", "fybcom_D");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                    else
                    {
                        final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                                .setTitle("No Internet Connection")
                                .setIcon(R.drawable.signal)
                                .setMessage("Please Switch on your Internet Connection")
                                .setPositiveButton("Settings", null)
                                .setNegativeButton("Cancel", null)
                                .show();

                        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        positiveButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
                            }
                        });

                        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                        negativeButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss();
                                Intent intent11 = new Intent(fybcom.this, MainActivity.class);
                                intent11.putExtra("div", "fybcom_D");
                                startActivity(intent11);
                                finish();
                            }
                        });
                    }
                }
            });
        }
        else
        {
            final AlertDialog dialog = new AlertDialog.Builder(fybcom.this)
                    .setTitle("No Internet Connection")
                    .setIcon(R.drawable.signal)
                    .setMessage("Please Switch on your Internet Connection")
                    .setPositiveButton("Settings", null)
                    .setNegativeButton("Cancel", null)
                    .show();

            Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
            positiveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                dialog.dismiss();
                startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
                }
            });

            Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
            negativeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    Intent intent11 = new Intent(fybcom.this, MainActivity.class);
                    intent11.putExtra("div", "fybcom_A");
                    startActivity(intent11);
                    finish();
                }
            });

        }


    }
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back button clicked ... \n Click on Logout button to exit", Toast.LENGTH_SHORT).show();
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
    public void showMessage(String title,String message){
        android.app.AlertDialog.Builder builder=new android.app.AlertDialog.Builder(this);
        builder.setCancelable(true);

        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }




}
