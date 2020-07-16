package com.example.recording;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ToggleButton startandoff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void togglebutton(View view){

        boolean checked=((ToggleButton)view).isChecked();
        Intent intent=new Intent(this,RecordingService.class);
        if (checked){

            startService(intent);
            Toast.makeText(getApplicationContext(),"Call Recording Started",Toast.LENGTH_SHORT).show();

        }
        else {
            stopService(intent);
            Toast.makeText(getApplicationContext(),"Call Recording Stopped",Toast.LENGTH_SHORT).show();
        }

    }
}


