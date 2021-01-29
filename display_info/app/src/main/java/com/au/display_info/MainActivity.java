package com.au.display_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email,phone,password,num_pass,age;
    Button submit;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        num_pass = findViewById(R.id.num_pass);
        age = findViewById(R.id.age);
        submit = findViewById(R.id.submit);
        textView = findViewById(R.id.textView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(name.getText()+"\n"+email.getText()+"\n"+phone.getText()+"\n"+
                        num_pass.getText()+"\n"+password.getText()+"\n"+age.getText());

                Toast.makeText(getApplicationContext(),name.getText()+"\n"+email.getText()+"\n"+phone.getText()
                        +"\n"+num_pass.getText()+"\n"+password.getText()+"\n"+age.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}