package com.example.teht10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;



public class MainActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    EditText etx;
    TextView tv;
    ListView liv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        etx = findViewById(R.id.etx);
        tv =  findViewById(R.id.tiv);
        liv = findViewById(R.id.liv);
        iv = findViewById(R.id.iv);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = etx.getText().toString() + ", ";
                tv.append(txt);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = tv.getText().toString();
                String url = "https://loremflickr.com/320/240/" + txt;
                liv.setAdapter(new adapteri(MainActivity.this, url));
                Picasso.get().load(url).into(iv);
            }
        });

    }
}
