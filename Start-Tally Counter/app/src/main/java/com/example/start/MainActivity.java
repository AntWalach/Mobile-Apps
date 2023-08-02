package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;

    private Button increaseBTN;
    private Button decreaseBTN;
    private Button resetBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        increaseBTN.setOnClickListener(v -> {
            String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) + 1);
            textView.setText(newText);
        });

        decreaseBTN.setOnClickListener(view -> {
            if (Integer.parseInt(textView.getText().toString()) != 0) {
                String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) - 1);
                textView.setText(newText);
            }
        });

    }


    public void resetTextView(View view){
        textView.setText("0");
    }
    private void setUI() {
        textView = findViewById(R.id.textView);

        increaseBTN = findViewById(R.id.increase);
        decreaseBTN = findViewById(R.id.decrease);
        resetBTN = findViewById(R.id.reset);

    }


}