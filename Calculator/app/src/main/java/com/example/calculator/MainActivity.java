package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

    Button buttontopla, buttoncikar, buttoncarp, buttonbol, gecis;
    EditText sayi1Text, sayi2Text;
    TextView sonucView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        final AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        sayi1Text = (EditText) findViewById(R.id.sayi1Text);
        sayi2Text= (EditText) findViewById(R.id.sayi2Text);
        sonucView = (TextView) findViewById(R.id.sonucView);
        buttontopla = (Button) findViewById(R.id.toplabutton);
        buttoncikar = (Button) findViewById(R.id.cikarbutton);
        buttoncarp = (Button) findViewById(R.id.carpbutton);
        buttonbol = (Button) findViewById(R.id.bolbutton);
        gecis = (Button) findViewById(R.id.bilimsel_gecis);

        buttontopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sayi1Text.getText().toString().isEmpty() || sayi2Text.getText().toString().isEmpty())
                {
                    sonucView.setText("Hatalı Giriş !");
                }
                else {
                    double sayi1 = Double.parseDouble(sayi1Text.getText().toString());
                    double sayi2 = Double.parseDouble(sayi2Text.getText().toString());

                    double sonuc = sayi1 + sayi2;
                    sonucView.setText(String.valueOf(sonuc));
                }
            }
        });

        buttoncikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sayi1Text.getText().toString().isEmpty() || sayi2Text.getText().toString().isEmpty())
                {
                    sonucView.setText("Hatalı Giriş !");
                }
                else {
                    double sayi1 = Double.parseDouble(sayi1Text.getText().toString());
                    double sayi2 = Double.parseDouble(sayi2Text.getText().toString());
                    double sonuc = sayi1 - sayi2;
                    sonucView.setText(String.valueOf(sonuc));
                }
            }
        });

        buttoncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sayi1Text.getText().toString().isEmpty() || sayi2Text.getText().toString().isEmpty())
                {
                    sonucView.setText("Hatalı Giriş !");
                }

                else {
                    double sayi1 = Double.parseDouble(sayi1Text.getText().toString());
                    double sayi2 = Double.parseDouble(sayi2Text.getText().toString());
                    double sonuc = sayi1 * sayi2;
                    sonucView.setText(String.valueOf(sonuc));
                }
            }
        });
        buttonbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sayi1Text.getText().toString().isEmpty() || sayi2Text.getText().toString().isEmpty())
                {
                    sonucView.setText("Hatalı Giriş !");
                }

                else {
                    double sayi1 = Double.parseDouble(sayi1Text.getText().toString());
                    double sayi2 = Double.parseDouble(sayi2Text.getText().toString());

                    if (sayi2 == 0) {
                        sonucView.setText("Tanımsızdır");
                    } else {
                        double sonuc = sayi1 / sayi2;
                        sonucView.setText(String.valueOf(sonuc));
                    }
                }
            }
        });
        gecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,BilimselActivity.class);
                startActivity(i1);
            }
        });
    }
}
