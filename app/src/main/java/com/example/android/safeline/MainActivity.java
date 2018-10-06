package com.example.android.safeline;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button emergency = (Button) findViewById(R.id.emergency);

       emergency.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent smsIntent = new Intent(android.content.Intent.ACTION_VIEW);
               smsIntent.setType("vnd.android-dir/mms-sms");
               smsIntent.putExtra("address", "your desired phoneNumber");
               smsIntent.putExtra("sms_body", "your desired message");
               startActivity(smsIntent);

           }
       });
        }
}
