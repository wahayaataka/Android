package com.example.parsingvariable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegi extends AppCompatActivity {
    private EditText editSisi, editHasil, editKeliling;
    private Button btnOk;
    private TextView txtSisi, txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        initUI();
        initEvent();
    }
    private void initUI(){
        txtSisi = (TextView)findViewById(R.id.txtSisi);
        txtLuas = (TextView)findViewById(R.id.txtLuas);
        txtKeliling = (TextView)findViewById(R.id.txtKeliling);
        editSisi = (EditText)findViewById(R.id.editSisi);
        editHasil = (EditText)findViewById(R.id.editHasil);
        editKeliling = (EditText)findViewById(R.id.editKeliling);
        btnOk = (Button)findViewById(R.id.btnOk);

    }
    private void initEvent(){
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();

            }
        });
    }
    private void hitungLuas(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi*sisi;
        editHasil.setText(luas+"");

    }
    private void hitungKeliling(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4*sisi;
        editKeliling.setText(keliling+"");
    }
}

