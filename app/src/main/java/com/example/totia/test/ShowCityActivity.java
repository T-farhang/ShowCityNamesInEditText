package com.example.totia.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShowCityActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_city);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        EditText edtCity = (EditText) findViewById(R.id.edtCity);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String showCity = bundle.getString("city");
            if (showCity != null) {
                String strCity = showCity;
                edtCity.setText(strCity);
            }
        }
    }
}
