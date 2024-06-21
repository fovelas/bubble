package com.fovelas.bubble;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnError = (Button) findViewById(R.id.main_activity_btn_error);
        Button btnInfo = (Button) findViewById(R.id.main_activity_btn_info);
        Button btnSuccess = (Button) findViewById(R.id.main_activity_btn_success);

        btnError.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Bubble.makeText(MainActivity.this, "Error message..", Bubble.TYPE_ERROR).show();
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Bubble.makeText(MainActivity.this, "Info message..", Bubble.TYPE_INFO).show();
            }
        });

        btnSuccess.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Bubble.makeText(MainActivity.this, "Success message..", Bubble.TYPE_SUCCESS).show();
            }
        });
    }
}