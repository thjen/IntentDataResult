package com.example.qthjen.intentdataresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private Button   btMain;

    int REQUEST_CODE_ACTIVITY2 = 123;   // số bất kì

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView) findViewById(R.id.tvMain);
        btMain = (Button) findViewById(R.id.btMain);

        btMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity2.class);
                startActivityForResult(intent, REQUEST_CODE_ACTIVITY2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if ( requestCode == REQUEST_CODE_ACTIVITY2 && resultCode == RESULT_OK && data != null) {
            String data2 = data.getStringExtra("key");
            tvMain.setText(data2);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
