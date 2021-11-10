package com.example.quanlythoigian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button BaoThuc;
    private Button DemNguoc;
    private Button BamGio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BaoThuc = (Button) this.findViewById(R.id.baothuc);
        BaoThuc.setOnClickListener(this::onClick2);

        DemNguoc = (Button) this.findViewById(R.id.demnguoc);
        DemNguoc.setOnClickListener(this::onClick);

        BamGio = (Button) this.findViewById(R.id.bamgio);
        BamGio.setOnClickListener(this::onClick1);

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, DemNguoc.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(this, BamGio.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(this, BaoThuc.class);
        startActivity(intent);
    }
}