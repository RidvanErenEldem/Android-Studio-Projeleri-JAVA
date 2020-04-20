package com.eldemtech.saysistemleridnmleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton ikilik1, ikilik2, sekizlik1, sekizlik2, onluk1, onluk2, onaltilik1, onaltilik2;
    EditText sayigirisi;
    /*Button array[];*/
    Button donustur, temizle;
    TextView sonuc;
    RadioGroup g1, g2;

    private static  final int[] idArray = {R.id.sifir, R.id.bir, R.id.iki, R.id.uc, R.id.dort, R.id.bes, R.id.alti, R.id.yedi, R.id.sekiz, R.id.dokuz, R.id.A, R.id.B, R.id.C, R.id.D, R.id.E, R.id.F};

    private Button[] button = new Button[idArray.length];

    int i,variable,variable2;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*array = new Button[16];

        array[0] = (Button)findViewById(R.id.sifir);
        array[1] = (Button)findViewById(R.id.bir);
        array[2] = (Button)findViewById(R.id.iki);
        array[3] = (Button)findViewById(R.id.uc);
        array[4] = (Button)findViewById(R.id.dort);
        array[5] = (Button)findViewById(R.id.bes);
        array[6] = (Button)findViewById(R.id.alti);
        array[7] = (Button)findViewById(R.id.yedi);
        array[8] = (Button)findViewById(R.id.sekiz);
        array[9] = (Button)findViewById(R.id.dokuz);
        array[10] = (Button)findViewById(R.id.on);
        array[11] = (Button)findViewById(R.id.A);
        array[12] = (Button)findViewById(R.id.B);
        array[13] = (Button)findViewById(R.id.C);
        array[14] = (Button)findViewById(R.id.D);
        array[15] = (Button)findViewById(R.id.E);
        array[16] = (Button)findViewById(R.id.F); */

        for (i = 0; i < idArray.length; i++)
        {
            button[i] = (Button)findViewById(idArray[i]);
            button[i].setOnClickListener(this);
        }

        temizle = (Button)findViewById(R.id.temizle);
        sonuc = (TextView)findViewById(R.id.sonuc);
        ikilik1 = (RadioButton)findViewById(R.id.ikilik1);
        ikilik2 = (RadioButton)findViewById(R.id.ikilik2);
        sekizlik1 = (RadioButton)findViewById(R.id.sekizlik1);
        sekizlik2 = (RadioButton)findViewById(R.id.sekizlik2);
        onluk1 = (RadioButton)findViewById(R.id.onluk1);
        onluk2 = (RadioButton)findViewById(R.id.onluk2);
        onaltilik1 = (RadioButton)findViewById(R.id.onaltilik1);
        onaltilik2 = (RadioButton)findViewById(R.id.onaltilik2);
        g1 = (RadioGroup)findViewById(R.id.g1);
        g2 = (RadioGroup)findViewById(R.id.g2);

        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.ikilik1)
                {
                    sayigirisi.setText("");
                    for(int i = 0; i < idArray.length; i++)
                    {
                        if (i < 2)
                            button[i].setEnabled(true);
                        else
                            button[i].setEnabled(false);
                    }
                }
                else if (checkedId==R.id.sekizlik1)
                {
                    sayigirisi.setText("");
                    for (int i = 0; i < idArray.length; i++)
                    {
                        if (i < 8)
                            button[i].setEnabled(true);
                        else
                            button[i].setEnabled(false);
                    }
                }
                else if (checkedId==R.id.onluk1)
                {
                    sayigirisi.setText("");
                    for (int i = 0; i < idArray.length; i++)
                    {
                        if (i < 10)
                            button[i].setEnabled(true);
                        else
                            button[i].setEnabled(false);
                    }
                }
                else if (checkedId==R.id.onaltilik1)
                {
                    sayigirisi.setText("");
                    for (int i = 0; i <idArray.length; i++)
                    {
                        button[i].setEnabled(true);
                    }
                }
            }
        });

        sayigirisi = (EditText)findViewById(R.id.sayigiris);

        donustur = (Button)findViewById(R.id.donustur);

        temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigirisi.setText("");
                sonuc.setText("SONUÇ");
            }
        });



        donustur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (ikilik1.isChecked() && sekizlik2.isChecked()) /* çözmem 2 saatden daha fazla sürdü */ {
                        String deger = sayigirisi.getText().toString();
                        String oct = Integer.toOctalString(Integer.parseInt(deger, 2));
                        sonuc.setText(oct);
                    } else if (ikilik1.isChecked() && onluk2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        int dec = Integer.parseInt(deger, 2);
                        String last = Integer.toString(dec);
                        sonuc.setText(last);
                    } else if (ikilik1.isChecked() && onaltilik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String hex = Integer.toHexString(Integer.parseInt(deger, 2));
                        sonuc.setText(hex.toUpperCase());
                    } else if (sekizlik1.isChecked() && ikilik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String bin = Integer.toBinaryString(Integer.parseInt(deger, 8));
                        sonuc.setText(bin);
                    } else if (sekizlik1.isChecked() && onluk2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        int dec = Integer.parseInt(deger, 8);
                        String last = Integer.toString(dec);
                        sonuc.setText(last);
                    } else if (sekizlik1.isChecked() && onaltilik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String hex = Integer.toHexString(Integer.parseInt(deger, 8));
                        sonuc.setText(hex.toUpperCase());
                    } else if (onluk1.isChecked() && ikilik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String bin = Integer.toBinaryString(Integer.parseInt(deger));
                        sonuc.setText(bin);
                    } else if (onluk1.isChecked() && sekizlik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String oct = Integer.toOctalString(Integer.parseInt(deger));
                        sonuc.setText(oct);
                    } else if (onluk1.isChecked() && onaltilik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String hex = Integer.toHexString(Integer.parseInt(deger));
                        sonuc.setText(hex.toUpperCase());

                    } else if (onaltilik1.isChecked() && ikilik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String bin = Integer.toBinaryString(Integer.parseInt(deger, 16));
                        sonuc.setText(bin);
                    } else if (onaltilik1.isChecked() && sekizlik2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        String oct = Integer.toOctalString(Integer.parseInt(deger, 16));
                        sonuc.setText(oct);
                    } else if (onaltilik1.isChecked() && onluk2.isChecked()) {
                        String deger = sayigirisi.getText().toString();
                        int dec = Integer.parseInt(deger, 16);
                        String last = Integer.toString(dec);
                        sonuc.setText(last);
                    } else
                        sonuc.setText(sayigirisi.getText().toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,"Hatalı Giriş !\nTekrar Deneyin!",Toast.LENGTH_SHORT).show();
                    sayigirisi.setText("");
                }
            }
        });
    }


    @Override
    public void onClick(View v) {
        Button button = (Button)v; /* bu kısmı çözmem 1 saatimi aldı */
        sayigirisi.append(((Button) v).getText());
    }
}
