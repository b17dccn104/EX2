package com.example.bai33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegistryActivity extends AppCompatActivity {

    private Button buttonRegis;
    private TextView textBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangki);

        buttonRegis = findViewById(R.id.buttonRegistry);
        textBack = findViewById(R.id.textBACK);

        buttonRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistryActivity.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
            }
        });

        textBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
