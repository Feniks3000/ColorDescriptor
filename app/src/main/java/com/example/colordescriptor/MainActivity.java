package com.example.colordescriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private TextView textViewDescriptionTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerColors=findViewById(R.id.spinnerColors);
        textViewDescriptionTemp=findViewById(R.id.textViewDescriptionTemp);

    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescriptionOfColor(position);
        textViewDescriptionTemp.setText(description);
//        textViewDescriptionTemp.setBackgroundColor(11);
    }

    public String getDescriptionOfColor(int idColor){
        String[] descriptions = getResources().getStringArray(R.array.description_of_color);
        return descriptions[idColor];
    }
}
