package com.example.converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inchesOutput;
    EditText mmInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mmInput = findViewById(R.id.millimeters);
        inchesOutput = findViewById(R.id.inches);
        Button convert = findViewById(R.id.btnConvert);
        Button exit = findViewById(R.id.btnExit);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mm = String.valueOf(mmInput.getText());
                if(!TextUtils.isEmpty(mm)){
                    Double millimeters = Double.valueOf(mm);
                    Double inches = millimeters/25.4;
                    inchesOutput.setText(String.valueOf(inches));
                }else{
                    Toast.makeText(MainActivity.this, "Please input millimeters first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
