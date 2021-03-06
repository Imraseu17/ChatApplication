package com.example.root.chatapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button inbox,compose,callList,callLogs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inbox = findViewById(R.id.btnInbox);
        compose = findViewById(R.id.btnCompose);
        callList = findViewById(R.id.callList);
        callLogs = findViewById(R.id.CallLogs);
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ReciveSmsActivity.class);
                startActivity(intent);
            }
        });

        compose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SendSmsActivity.class);
                startActivity(intent);
            }
        });

        callList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ContactListActivity.class);
                startActivity(i);
            }
        });

        callLogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CallLogActivity.class);
                startActivity(i);
            }
        });
    }
}
