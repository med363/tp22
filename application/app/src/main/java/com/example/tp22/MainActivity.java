package com.example.tp22;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     int mCount=0;
     TextView mShowCount;
     Button btn;
     EditText t;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.mShowCount);
        btn= findViewById(R.id.btn);
        t= findViewById(R.id.t);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount++;
                if (mShowCount != null)
                    mShowCount.setText(Integer.toString(mCount));
            }
        });

        //edit text change count
        t.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not needed in this case
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Update the count when the text changes
                if (mShowCount != null) {
                    try {
                        mCount = Integer.parseInt(s.toString());
                        mShowCount.setText(Integer.toString(mCount));
                    } catch (NumberFormatException e) {
                        // Handle invalid input
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Not needed in this case
            }
        });

    }









    // save state when rotate screen
    @Override
    protected void  onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("key_counter",mCount);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        mCount = savedInstanceState.getInt("key_counter",0);
        mShowCount.setText(Integer.toString(mCount));
    }

}