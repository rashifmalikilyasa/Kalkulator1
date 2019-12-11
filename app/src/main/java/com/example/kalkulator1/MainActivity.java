package com.example.kalkulator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextA, editTextB, editTextC;

    protected float textA, textB, textC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = (EditText) findViewById(R.id.txtA);
        editTextB = (EditText) findViewById(R.id.txtB);
        editTextC = (EditText) findViewById(R.id.txtC);

        Button tambah = (Button) findViewById(R.id.btnTambah);
        Button kurang = (Button) findViewById(R.id.btnKurang);
        Button kali = (Button) findViewById(R.id.btnKali);
        Button bagi = (Button) findViewById(R.id.btnBagi);

        tambah.setOnClickListener(this);
        kurang.setOnClickListener(this);
        kali.setOnClickListener(this);
        bagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        textA = Float.parseFloat(editTextA.getText().toString());
        textB = Float.parseFloat(editTextB.getText().toString());

        switch (v.getId()){
            case R.id.btnTambah:
                textC = textA + textB;

                editTextC.setText(Float.toString(textC));
                break;
            case R.id.btnKurang:
                textC = textA - textB;

                editTextC.setText(Float.toString(textC));
                break;
            case R.id.btnKali:
                textC = textA * textB;

                editTextC.setText(Float.toString(textC));
                break;
            case R.id.btnBagi:
                textC = textA / textB;

                editTextC.setText(Float.toString(textC));
                break;
        }
    }
}
