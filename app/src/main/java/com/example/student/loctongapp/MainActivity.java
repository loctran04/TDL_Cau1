package com.example.student.loctongapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSum;
    EditText edtSoA,edtSoB,edtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSum = findViewById(R.id.btnTong);
        edtSoA = findViewById(R.id.edtSoA);
        edtSoB = findViewById(R.id.edtSoB);
        edtResult = findViewById(R.id.edtResult);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float soA = Float.parseFloat(edtSoA.getText().toString());
                float soB = Float.parseFloat(edtSoB.getText().toString());
                float Tong;

                Tong = soA + soB;

                edtResult.setText(Tong +"");

            }
        });
    }
}
