
package com.example.progressbar;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
public class MainActivity extends AppCompatActivity{
    ProgressBar pg01;
    int progress=0;
    @SuppressLint("MissingInflatedld")
    @Override
    protected void onCreate(Bundle savedInstantState)
    {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_main);
        pg01=(ProgressBar)findViewById(R.id.pg);
    }
}