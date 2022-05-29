package com.ReviewIT.FeedbackByEmtion;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class first_page extends AppCompatActivity {

    private Button next;
    private EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first_page);
        Log.d("Hello!!!","created");
        next = findViewById(R.id.Pupdate_detail_button);
        et1 = findViewById(R.id.Pfull_name);
        et2 = findViewById(R.id.PemailID);
        et3 = findViewById(R.id.Pphone_no);


        next.setOnClickListener(view -> {
             if(!et1.getText().toString().isEmpty() && !et2.getText().toString().isEmpty() && !et3.getText().toString().isEmpty()) {
                 Intent intent = new Intent(view.getContext(), MainActivity.class);
                 startActivityForResult(intent, 0);
             }else{
                 Toast.makeText(getApplicationContext(),"Please enter all the details!",Toast.LENGTH_LONG).show();
             }
        });
    }
}