package com.example.qthjen.intentdataresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity2 extends AppCompatActivity {

    EditText etActivity2;
    Button btActivity2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        etActivity2 = (EditText) findViewById(R.id.etActivity2);
        btActivity2 = (Button) findViewById(R.id.btActivity2);

        btActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String data = etActivity2.getText().toString();
                intent.putExtra("key", data);
                setResult(RESULT_OK, intent); // result_ok là key mặc định
                finish(); // đóng activity hiện tại
            }
        });

    }
}
