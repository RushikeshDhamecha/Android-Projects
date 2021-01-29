package com.au.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2,textView3,display;
    EditText start_txt,end_txt,table_of;
    Button show;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        display = findViewById(R.id.display);
        display.setMovementMethod(new ScrollingMovementMethod());
        start_txt = findViewById(R.id.start_txt);
        end_txt = findViewById(R.id.end_txt);
        table_of = findViewById(R.id.table_of);
        show = findViewById(R.id.show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String start = start_txt.getText().toString();
                int s = Integer.parseInt(start);
                String end = end_txt.getText().toString();
                int e = Integer.parseInt(end);
                String table = table_of.getText().toString();
                int t = Integer.parseInt(table);

                for (i=s; i<=e; i++){
                    display.setText(display.getText().toString()+t+"   *   "+i+"   =   "+(t*i)+"\n");
                }
            }
        });
    }
}
