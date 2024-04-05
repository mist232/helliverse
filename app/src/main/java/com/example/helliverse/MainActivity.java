package com.example.helliverse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

 @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);

 }
 @Override
protected void attachBaseContext(Context newBase) {
    
    final Configuration override = new Configuration(newBase.getResources().getConfiguration());
    override.fontScale = 1.0f;
    applyOverrideConfiguration(override);

    super.attachBaseContext(newBase);
}
}
