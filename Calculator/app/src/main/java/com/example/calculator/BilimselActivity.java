package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BilimselActivity extends AppCompatActivity {
    EditText bilimselText;
    TextView bilimselSonuc;
    Button btnsin, btncos, btntan, btncot, log_10, ln, fak, karekok;


    int faktoriyel(int a)
    {
        if (a !=1)
        {
            return  a* faktoriyel(a-1);
        }
        else
            return 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilimsel);

        bilimselText = (EditText) findViewById(R.id.bilimselText);
        bilimselSonuc = (TextView) findViewById(R.id.bilimselsonuc);
        btnsin = (Button) findViewById(R.id.btnsinus);
        btncos = (Button) findViewById(R.id.btncosinus);
        btntan = (Button) findViewById(R.id.btntan);
        btncot = (Button) findViewById(R.id.btncot);
        log_10 = (Button) findViewById(R.id.log_10);
        ln = (Button) findViewById(R.id.lne);
        fak = (Button) findViewById(R.id.fak);
        karekok = (Button) findViewById(R.id.sqrt);

        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty())
                {
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else {
                    double sayi = Double.parseDouble(bilimselText.getText().toString());
                    double bilimselsonuc = Math.sin(Math.PI*sayi/180);
                    bilimselSonuc.setText(String.valueOf(bilimselsonuc));
                }
            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty())
                {
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else
                {
                    double sayi = Double.parseDouble(bilimselText.getText().toString());
                    double bilimselsonuc = Math.cos(Math.PI*sayi/180);
                    bilimselSonuc.setText(String.valueOf(bilimselsonuc));
                }
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty()){
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else {
                    double sayi = Double.parseDouble(bilimselText.getText().toString());
                    double bilimselsonuc = Math.tan(Math.PI*sayi/180);
                    bilimselSonuc.setText(String.valueOf(bilimselsonuc));
                }
            }
        });
        btncot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty())
                {
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else
                {
                    double sayi = Double.parseDouble(bilimselText.getText().toString());
                    double araeleman = Math.tan(Math.PI*sayi/180);
                    double bilimselsonuc = 1/araeleman;
                    bilimselSonuc.setText(String.valueOf(bilimselsonuc));

                }
            }
        });
        log_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty())
                {
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else
                {
                    double sayi = Double.parseDouble(bilimselText.getText().toString());
                    if (sayi == 0)
                    {
                        bilimselSonuc.setText("Hatalı Giriş !");
                    }
                    else {
                        double bilimselsonuc = Math.log10(sayi);
                        bilimselSonuc.setText(String.valueOf(bilimselsonuc));
                    }
                }
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty())
                {
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else
                {
                    double sayi = Double.parseDouble(bilimselText.getText().toString());
                    if (sayi == 0)
                    {
                        bilimselSonuc.setText("Hatalı Giriş !");
                    }
                    else
                    {
                        double bilimselsonuc = Math.log(sayi);
                        bilimselSonuc.setText(String.valueOf(bilimselsonuc));
                    }
                }
            }
        });
        fak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty())
                {
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else if (bilimselText.getText().toString() == "0")
                    bilimselSonuc.setText("Hatalı Giriş !");
                else
                {
                    int sayi = Integer.parseInt(bilimselText.getText().toString());
                    int bilimselsonuc = faktoriyel(sayi);
                    bilimselSonuc.setText(String.valueOf(bilimselsonuc));
                }
            }
        });
        karekok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bilimselText.getText().toString().isEmpty())
                {
                    bilimselSonuc.setText("Hatalı Giriş !");
                }
                else
                {
                    double sayi = Double.parseDouble(bilimselText.getText().toString());
                    double bilimselsonuc = Math.sqrt(sayi);
                    bilimselSonuc.setText(String.valueOf(bilimselsonuc));
                }
            }
        });

    }
}
